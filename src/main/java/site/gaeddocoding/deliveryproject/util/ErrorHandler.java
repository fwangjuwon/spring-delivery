package site.gaeddocoding.deliveryproject.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseDto<?> error1(RuntimeException e) {
        return new ResponseDto<>(-1, "실패", e.getMessage());
    }

}
