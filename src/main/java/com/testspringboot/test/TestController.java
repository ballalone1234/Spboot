package com.testspringboot.test;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "home";
    }
}
