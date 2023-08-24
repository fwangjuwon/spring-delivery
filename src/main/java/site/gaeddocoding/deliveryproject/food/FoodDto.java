package site.gaeddocoding.deliveryproject.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodDto {

    private Integer id;
    private String foodName; // 이름

    private Integer foodPrice;// 가격

    private String foodSize; // 사이즈
    private boolean sideDish; // 사이드디쉬여부지
}
