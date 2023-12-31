package site.gaeddocoding.deliveryproject.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto<T> {
    private Integer code; // -1 실패, 1 성공
    private String msg;
    private T data;
}