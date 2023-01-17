package saj.mota.tiago.sbformexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import saj.mota.tiago.sbformexample.entities.Name;

@Controller
@RequestMapping("/form")
public class FormController {

    @GetMapping("/fill")
    public String fill(Model model) {
        model.addAttribute("name", new Name());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Name name, Model model) {
        model.addAttribute("name", name);
        return "list";
    }

}
