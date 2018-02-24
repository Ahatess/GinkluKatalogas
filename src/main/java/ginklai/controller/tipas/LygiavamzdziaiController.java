package ginklai.controller.tipas;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class LygiavamzdziaiController {
    @RequestMapping(Application.TYPE_LYGIAVAMZDZIAI)
    String index(Model model) {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.rodykLygiavamzdzius();

        model.addAttribute("weapons", atsakymas);


        return "at_lygiavamzdziai";
    }

}