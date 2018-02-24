package ginklai.controller.paskirtis;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class TaikiniamsController {
    @RequestMapping(Application.PURPOSE_TARGETS)
    String index (Model model){
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykTaikiniams();
        model.addAttribute("weapons",atsakymas);

        return "for_targets";
    }
}
