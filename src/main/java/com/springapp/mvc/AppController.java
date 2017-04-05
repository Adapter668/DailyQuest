package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class AppController {
    @RequestMapping(method = RequestMethod.GET)
    public String sendAppView(ModelMap model) {
        return "app";
    }
}