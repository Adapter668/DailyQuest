package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @RequestMapping(method = RequestMethod.GET)
    public String sendRegisterView(ModelMap model) {
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(@RequestParam String name, @RequestParam String email, @RequestParam String pwd){
        System.out.println("Register:\n" + name + "\n" + email + "\n" + pwd);
        return "hello"; //TODO + encryption
    }
}