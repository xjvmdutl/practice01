package com.example.test01.wishlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class PageController {
    @RequestMapping("/main")
    public ModelAndView main() {
        return new ModelAndView("aaaa/main");
    }
}
