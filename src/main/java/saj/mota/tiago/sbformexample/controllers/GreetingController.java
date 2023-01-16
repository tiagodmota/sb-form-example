package saj.mota.tiago.sbformexample.controllers;

import saj.mota.tiago.sbformexample.entities.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @GetMapping("/greeting-form")
    public String greetingForm(Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    @PostMapping("/greeting-submit")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting-result";
    }
    
}
