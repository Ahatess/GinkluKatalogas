package ginklai.controller;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaskirtisController {
    @RequestMapping(Application.PURPOSE)
    String index (){
        return "index";
    }
}