package ca.tetertvak.hellouser2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserController {

    @GetMapping("luckyNumber")
    public String luckyNumber(Model model){

        int rand = 1 + (int)(100*Math.random());
        model.addAttribute("luckyNumber", rand);

        return "LuckyNumber";
    }


}
