package ginklai.controller.parinktys;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MedzGraiztController {

    @RequestMapping(Application.PAR_MEDZ_GRAIZT)

    @RequestParam(value = "hunting", required = false,defaultValue = "off") String hunting,
    @RequestParam( value = "self_defence", required = false, defaultValue = "off") String self_defence,
    Model model;
    {
        ArrayList<HashMap<String, String>> atsakymas = Application.sql.parinkimasMedziokleiGraiztvinis();
        model.addAttribute("hunting", hunting);
        model.addAttribute("self_defence", self_defence);

    }
}

