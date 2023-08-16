package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class FoodController {
    //dependency injection
    private final FoodService foodService;
    private final FoodRepository foodRepository;

    @GetMapping("/foods")
    public String selectAllFood(){
        return "";
    }

    @GetMapping("/foods/{id}")
    public String selectSingleFood(@PathVariable Integer id){
        return "";
    }

    @PostMapping("/foods")
    public String insertFood(){
        return "";
    }

    @PutMapping("/foods")
    public String updateFood(){
        return "";
    }

    @DeleteMapping("/foods")
    public String deleteAllFood(){
        return "";
    }

    @DeleteMapping("/foods/{id}")
    public String deleteSingleFood(@PathVariable Integer id){
        return "";
    }
}
