package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import site.gaeddocoding.deliveryproject.util.ResponseDto;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class FoodController {
    // dependency injection
    private final FoodService foodService;

    @GetMapping("/foods")
    public ResponseEntity<?> selectAllFood() {
        List<Food> foodDto= foodService.searchAllFood();
        return new ResponseEntity<>(new ResponseDto<>(1, "전체 갖고오기 성공!", foodDto), HttpStatus.OK);

    }

    @GetMapping("/foods/{id}")
    public Food selectSingleFood(@PathVariable Integer id) {
        return foodService.serachSingleFood(id);

    }

    @PostMapping("/foods")
    public @ResponseBody ResponseDto<String> insertFood(@RequestBody FoodDto foodDto) {

        if (foodDto.getFoodName() == null || foodDto.getFoodPrice() == null) {
            return new ResponseDto<String>(-1, "실패!! 음식 정보는 필수 값 입니다!!(이름, 가격)", null);
        }
        foodService.registerFood(foodDto);
        return new ResponseDto<String>(1, "성공", null);

    }

    @PutMapping("/foods/{id}")
    public @ResponseBody ResponseDto<String> updateFood(@PathVariable Integer id, @RequestBody FoodDto food) {

        if (food.getFoodName() == null || food.getFoodPrice() == null || food.getFoodSize() == null) {
            return new ResponseDto<String>(-1, "실패!! 음식 정보는 필수 값 입니다!!(이름, 가격, 사이즈)", null);

        } else {
            foodService.editFood(food, id);
            return new ResponseDto<String>(1, "성공! 데이터 변경 완료!", null);
        }
    }

    @DeleteMapping("/foods/{id}")
    public @ResponseBody ResponseDto<String> deleteSingleFood(@PathVariable Integer id) {

        foodService.deleteSingleFood(id);
        return new ResponseDto<String>(1, "성공", null);

    }
}
