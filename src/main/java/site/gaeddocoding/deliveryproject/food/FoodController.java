package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class FoodController {
    // dependency injection
    private final FoodService foodService;

    @GetMapping("/foods")
    public List<Food> selectAllFood() {
        return foodService.searchAllFood();

    }

    @GetMapping("/foods/{id}")
    @ResponseBody
    public Food selectSingleFood(@PathVariable Integer id) {
        return foodService.serachSingleFood(id);

    }

    @PostMapping("/foods")
    public Food insertFood(@RequestBody FoodDto foodDto) {
        return foodService.registerFood(foodDto);

    }

    @PutMapping("/foods/{id}")
    @ResponseBody
    public void updateFood( @PathVariable Integer id, @RequestBody Food food) {
         foodService.editFood(food, id);
            }


    @DeleteMapping("/foods/{id}")
    public void deleteSingleFood(@PathVariable Integer id) {
        foodService.deleteSingleFood(id);
    }
}
