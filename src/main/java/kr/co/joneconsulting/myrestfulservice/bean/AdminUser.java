package kr.co.joneconsulting.myrestfulservice.bean;

import com.fasterxml.jackson.annotation.JsonFilter;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("UserInfo") // Filter 이름: UserInfo
public class AdminUser {

    private Integer id;

    @Size(min = 2, message = "이름은 2글자 이상 입력해주세요. ")
    private String name;

    @Past(message = "등록일은 미래 날짜를 입력할 수 없습니다. ")
    private Date joinDate;

    private String password;

    private String ssn;
}
