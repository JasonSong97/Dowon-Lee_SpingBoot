package kr.co.joneconsulting.myrestfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Setter + Getter
@AllArgsConstructor // 아래의 생성자 지워야함
public class HelloWorldBean {

    // 옆에 Structure 보면 어떤 메소드가 이 클래스에 존재하는 지 알 수 있음. final 지구면 setter 생성
    private final String message;

//    public HelloWorldBean(String message) {
//        this.message = message;
//    }
}
