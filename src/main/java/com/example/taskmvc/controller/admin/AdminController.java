package com.example.taskmvc.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "homeControllerOdAdmin")
public class AdminController {
    @RequestMapping(value = "/admin-home", method = RequestMethod.GET)

    public ModelAndView homePage() {

        ModelAndView mav = new ModelAndView("admin/home");

        return mav;

    }
}
