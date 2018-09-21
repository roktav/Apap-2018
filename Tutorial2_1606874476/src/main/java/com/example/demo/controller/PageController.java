package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class PageController {
    @RequestMapping("/viral")
    public String index(){
        return "viral2jari";
    }

    @RequestMapping("/challenge")
    public String challenge(@RequestParam(value = "name", defaultValue = "Kiki") String name, Model model) {
        model.addAttribute("name", name);
        return "challenge";
    }

    @RequestMapping("/generator")
    public String generator(@RequestParam(value = "a", defaultValue = "0") String x, @RequestParam(value = "b", defaultValue = "0") String y, Model model) {
        model.addAttribute("a", x);
        model.addAttribute("b", y);
        int xx = Integer.parseInt(x);
        int yy = Integer.parseInt(y);

        if (xx == 0) {
            xx = 1;
        }
        if (yy == 0) {
            yy = 1;
        }

        String hm = "h";
        for (int i = 0; i < xx; i++) {
            hm += "m";
        }

        String text = "";
        for (int i = 0; i < yy; i++) {
            text += (hm + " ");
        }
        System.out.println(text);
        model.addAttribute("text", text);
        return "generator";
    }
}