package saj.mota.tiago.sbformexample.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import saj.mota.tiago.sbformexample.entities.Customer;
import saj.mota.tiago.sbformexample.repositories.CustomerRepository;

public class CustomerController {
    
    private CustomerRepository customerRepository;
    
    @GetMapping("/add-customer")
    public String addCustomer(Customer customer) {
        return "add-customer";
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "redirect:/list-customer";
        // Se não funfar, tira esse redirect.
    }

    @GetMapping("/list-customer")
    public String listCustomer(ModelMap model) {
        model.addAttribute("customerList", customerRepository.findAll());
        return "list-customer";
    }
}
