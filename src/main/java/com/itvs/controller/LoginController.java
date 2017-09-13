package com.itvs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/page")
public class LoginController {

    @RequestMapping("/index")
    public ModelAndView loginToManin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/index_v1")
    public ModelAndView loginToIndexV(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index_v1");
        return modelAndView;
    }

    @RequestMapping("/graph_sparkline")
    public ModelAndView graphSparkline(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("graph_sparkline");
        return modelAndView;
    }

    @RequestMapping("/graph_metrics")
    public ModelAndView graphMetrices(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("graph_metrics");
        return modelAndView;
    }

    @RequestMapping("/photo")
    public ModelAndView myPhoto(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("photo");
        return modelAndView;
    }

}
