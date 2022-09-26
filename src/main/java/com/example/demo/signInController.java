package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class signInController {
    @RequestMapping("/signIn")
    public String loginMessage(){
        return "signIn";
    }
}
