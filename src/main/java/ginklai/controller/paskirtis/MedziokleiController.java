package ginklai.controller.paskirtis;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MedziokleiController {
    @RequestMapping(Application.PURPOSE_HUNTING)
    String index(Model model) {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykMedžioklinius();

        model.addAttribute("weapons", atsakymas);


        return "for_hunting";
    }

}