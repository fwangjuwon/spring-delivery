package site.gaeddocoding.deliveryproject.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodDto {
    private Integer code; //-1 실패, 1 성공
    private String msg; //에러메세지
}
