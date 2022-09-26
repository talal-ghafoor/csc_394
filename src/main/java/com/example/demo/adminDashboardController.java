package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminDashboardController {
    @RequestMapping("/admin-dashboard")
    public String loginMessage(){
        return "admin-dashboard";
    }
}