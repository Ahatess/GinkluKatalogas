package ginklai.controller.tipas;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class PneumatiniaiController {
    @RequestMapping(Application.TYPE_PNEUMATINIAI)
    String index(Model model) {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykPneumatinius();

        model.addAttribute("weapons", atsakymas);


        return "at_pneumatiniai";
    }

}