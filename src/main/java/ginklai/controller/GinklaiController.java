package ginklai.controller;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class GinklaiController {
    @RequestMapping(Application.WEAPONS)
    String index(Model model) {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykVisus();
        model.addAttribute("weapons", atsakymas);

        return "ginklai";
    }
}
