package Examination.Examinationhall_Info.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * 회원 등록
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {

    //==회원 등록 폼 화면==//
    @GetMapping("/users/new")
    public String createForm(Model model){
        model.addAttribute("userForm",new UserForm());
        return "users/userForm";
    }

    //==회원 등록==//
    @PostMapping("/users/new")
    public String create(@Valid UserForm form, BindingResult result){
        if(result.hasErrors()){ //검증
            return "users/userForm";
        }


        return "redirect:/";
    }


}
