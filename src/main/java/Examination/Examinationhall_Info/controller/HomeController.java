package Examination.Examinationhall_Info.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * welcome page
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    @GetMapping(value = "/")
    public String createForm(Model model){

        return "home"; //home.html
    }




}
