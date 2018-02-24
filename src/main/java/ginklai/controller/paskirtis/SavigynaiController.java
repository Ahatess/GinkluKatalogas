package ginklai.controller.paskirtis;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class SavigynaiController {
    @RequestMapping(Application.PURPOSE_SELF_DEFENCE)
    String index(Model model) {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykSavigynai();

        model.addAttribute("weapons",atsakymas);

        return "for_selfdefence";
    }
}