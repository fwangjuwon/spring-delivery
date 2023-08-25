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
    public @ResponseBody Food updateFood(@RequestBody FoodDto foodDto, @PathVariable Integer id) {
        Food food = foodService.editFood(foodDto, id);
        return food;
    }

    @DeleteMapping("/foods")
    public String deleteAllFood() {
        return "";
    }

    @DeleteMapping("/foods/{id}")
    public String deleteSingleFood(@PathVariable Integer id) {
        return "";
    }
}
