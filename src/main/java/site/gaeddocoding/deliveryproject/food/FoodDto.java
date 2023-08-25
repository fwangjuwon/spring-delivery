package site.gaeddocoding.deliveryproject.food;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodDto {

    private Integer id;
    private String foodName; // 이름

    private Integer foodPrice;// 가격

    private String foodSize; // 사이즈

    public Food toEntity() {
        return Food.builder()
                .id(this.id)
                .foodName(this.foodName)
                .foodPrice(this.foodPrice)
                .foodSize(this.foodSize)
                .build();
    }
}
