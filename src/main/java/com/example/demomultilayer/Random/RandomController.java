package com.example.demomultilayer.Random;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RandomController {

    @RequestMapping(value = "/joke")
    public String listItems(@ModelAttribute("joke")Model model){
        return "index";
    }


}
