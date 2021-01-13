package com.example.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @RequestMapping("/mee")
    public String index(Model model) throws Exception {
        model.addAttribute("title", "Hello");
        model.addAttribute("myName", "Your name");
        return  "index";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloThere(@RequestParam String username, String password, Model model){
        model.addAttribute("title", username);
        model.addAttribute("myName", password );
        return  "index";
    }
}
