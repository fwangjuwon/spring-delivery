package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@RequiredArgsConstructor // 의존성주입
@Service
public class FoodService {

    // Dependency Injection
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
    public String editFood() {
        return "";
    }

    // 음식전체삭제
    @Transactional

    public String deleteAllFood() {
        return "";
    }

    // 음식개별삭제
    @Transactional
    public String deleteSingleFood() {
        return "";
    }
}
