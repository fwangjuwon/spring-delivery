package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor //생성자주입
@RestController
public class FoodController {
    //dependency injection
    private final FoodService foodService;
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

    @PutMapping("/foods/{id}")
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
