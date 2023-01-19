package saj.mota.tiago.sbformexample.controllers;

import saj.mota.tiago.sbformexample.entities.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//TODO: Use a single View for both purposes.
//TODO: WAR vs. JAR
@Controller
public class GreetingController {

    @GetMapping("/greeting-form")
    public String greetingForm(Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    /*
    ALTERNATIVE>

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
    */

    @PostMapping("/greeting-submit")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting-result";
    }
    
    /*
    ALTERNATIVE>
    
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting-result";
    }
    */

}
