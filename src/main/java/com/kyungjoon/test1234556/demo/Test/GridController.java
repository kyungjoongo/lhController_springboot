package com.kyungjoon.test1234556.demo.Test;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;


@Controller
public class GridController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(GridController.class);




    @GetMapping("/list")
    public ModelAndView gridList() {
        ModelAndView mav = new ModelAndView();
        HashMap resultMap = new HashMap();

        System.out.println("sdlfklsdkf----------->");

        mav.setViewName("/hello");
        return mav;

    }





}
