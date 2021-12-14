package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWebController {
    @GetMapping("/web")
        public String Hello(){
            return "hello";
        }
    @GetMapping("/web/message")
        public String Message(Model model){
            model.addAttribute("message","this is custom message");
            return "message";
        }
}
