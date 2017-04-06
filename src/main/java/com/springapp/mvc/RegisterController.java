package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Kontroler dla strony z rejestracją
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    /**
     * Zwraca widok rejetracji
     * @param model model
     * @return widok formularza rejestracji
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendRegisterView(ModelMap model) {
        return "register";
    }

    /**
     * Rejestrowanie uzytkownika
     * @param name nazwa rejestrującego się użytkownika
     * @param email email rejestrującego się użytkownika
     * @param pwd hasło rejestrującego się użytkownika
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submit(@RequestParam String name, @RequestParam String email, @RequestParam String pwd){
        System.out.println("Register:\n" + name + "\n" + email + "\n" + pwd);
        return "hello"; //TODO + encryption
    }
}