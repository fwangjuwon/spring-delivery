package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.gaeddocoding.deliveryproject.util.CustomException;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RequiredArgsConstructor // 의존성주입
@Service
public class FoodService {

    private final FoodRepository foodRepository;

    // 음식전체조회
    public List<Food> searchAllFood() {
        return foodRepository.findAll();
    }

    // 음식단일조회
    public Food serachSingleFood(Integer id) {
        return foodRepository.findById(id).get();
    }

    // 음식등록
    @Transactional
    public Food registerFood(FoodDto foodDto) {
        Food food = foodDto.toEntity();
        return foodRepository.save(food);
    }

    // 음식수정
    @Transactional
    public void editFood(FoodDto food, Integer id) {
        Optional<Food> foodOp = foodRepository.findById(id);

        if (foodOp.isPresent()) {
            Food foodEntity = foodOp.get();
            foodEntity.setFoodName(food.getFoodName());
            foodEntity.setFoodPrice(food.getFoodPrice());
            foodEntity.setFoodSize(food.getFoodSize());
        } else {
            throw new CustomException("id를 찾을 수 없습니다!!");
        }
    }

    // 음식개별삭제
    @Transactional
    public void deleteSingleFood(Integer id) {
        Optional<Food> foodOp = foodRepository.findById(id);

        if (foodOp.isPresent()) {
            foodRepository.deleteById(id);
        } else {
            throw new CustomException("해당 id에 데이터가 없습니다!!");
        }
    }
}
