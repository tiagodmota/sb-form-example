package saj.mota.tiago.sbformexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/form")
public class FormController {

    @GetMapping("/fill")
    public String fill() {
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@RequestBody String name, Model model) {
        if (name.isEmpty()) {
            name = "default";
        }
        model.addAttribute("name", name);
        return "list";
    }

}
