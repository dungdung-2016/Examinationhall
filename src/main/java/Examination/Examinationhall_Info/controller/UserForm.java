package Examination.Examinationhall_Info.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 로그인 시 전달할 Form
 */
@Getter
@Setter
public class UserForm {

    @NotBlank(message = "이메일(아이디)를 입력해 주세요.")
    private String email;

    @NotNull(message = "비밀번호를 입력해 주세요.")
    private String password;



}
