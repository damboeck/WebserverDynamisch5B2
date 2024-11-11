package at.ac.htlstp.et.sj24k5b2.webserverdynamisch5b2.controller;

import at.ac.htlstp.et.sj24k5b2.webserverdynamisch5b2.model.IndexFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/abc")
    public String index(Model model) {
        IndexFormDto indexFormDto = new IndexFormDto("WERT");
        model.addAttribute("msg", "Hallo 5B2!");
        model.addAttribute("indexFormDto", indexFormDto);
        return "index";
    }

    @PostMapping("/res")
    public String index(Model model, IndexFormDto indexFormDto) {
        return "index";
    }

}
