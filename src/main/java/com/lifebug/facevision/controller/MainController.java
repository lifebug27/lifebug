package com.lifebug.facevision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @GetMapping("/refresh")
    public String refresh(RedirectAttributes redirectAttributes) {
        return "index";
    }
}
