package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Kontroler dla strony profilu
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {

    /**
     * Zwraca widok strony profilu
     * @param model model
     * @return widok strony profilu
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendProfileView(ModelMap model) {
		model.addAttribute("userLogin", "JakisUser"); //TODO
        model.addAttribute("userLevel", "10"); //TODO

        model.addAttribute("privateQuestsDone", "11"); //TODO
        model.addAttribute("privateQuestsPoints", "590"); //TODO
        model.addAttribute("friendsQuestsDone", "20"); //TODO
        model.addAttribute("friendsQuestsPoints", "1024"); //TODO
        return "profile";
    }
}