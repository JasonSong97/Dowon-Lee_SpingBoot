package kr.co.joneconsulting.myrestfulservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // 상태코드가 500에서 404로 변경
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {
        super(message); // 부모 클래스인 RuntimeException 에 던지기
    }
}
