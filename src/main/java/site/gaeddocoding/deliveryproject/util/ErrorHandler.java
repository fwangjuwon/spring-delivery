package site.gaeddocoding.deliveryproject.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //모든 exception을 낚아챔
public class ErrorHandler {

@ExceptionHandler(CustomException.class)
    public ResponseEntity<?> apiException(CustomException e){
        return new ResponseEntity<>(new ResponseDto<>(-1, e.getMessage(), null), HttpStatus.BAD_REQUEST);
    }
}
