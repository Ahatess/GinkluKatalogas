package ginklai.controller;

import ginklai.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping(Application.HOME)
    String index(
            @RequestParam(
                    value="name",
                    required=false,
                    defaultValue = "atvykę"
            )
            String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "index";

                //"<ul><li><a href='" + Application.WEAPONS + "'>Naršyti visus ginklus</a>" +
                //"<li><a href='" + Application.PURPOSE + "'>Naršyti pagal paskirtį" +
                //"<li><a href='" + Application.TYPE + "'>Naršyti pagal tipą<ul>";
    }


}
