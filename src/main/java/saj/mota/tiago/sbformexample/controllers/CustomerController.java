package saj.mota.tiago.sbformexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.*;
import saj.mota.tiago.sbformexample.entities.Customer;
import saj.mota.tiago.sbformexample.services.CustomerService;


@Controller
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/add-customer")
    public String addCustomer(Customer customer) {
        return "add-customer";
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute @Valid Customer customer, BindingResult result) {

        if (result.hasErrors()){
            return "add-customer";
        } else {
            customerService.save(customer);
            return "redirect:/list-customer";
        }
    
    }

    @GetMapping("/list-customer")
    public String listCustomer(ModelMap model) {
        model.addAttribute("customerList", customerService.getAll());
        return "list-customer";
    }

    @GetMapping("/customer/{id}")
    public String customerById(@PathVariable(name = "id", required = true) String id, Model model) {
        model.addAttribute("customerList", customerService.findById(Long.valueOf(id)));
        return "list-customer";
    }

    @GetMapping("/delete-customer")
    public String deleteCustomer(
        @RequestParam(name = "id", required = true) 
        String id) {
        customerService.delete(Long.valueOf(id));
        return "redirect:/list-customer";
    }

    @GetMapping("/edit-customer")
    public String editCustomer(@RequestParam(name = "id", required = true) String id, Model model) {
        model.addAttribute("customer", customerService.findById(Long.valueOf(id)));
        return "add-customer";
    }


}
