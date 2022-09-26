package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminPanelController {
    @RequestMapping("/admin")
    public String loginMessage(){
        return "login";
    }
}
