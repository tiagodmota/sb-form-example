package saj.mota.tiago.sbformexample.controllers;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import saj.mota.tiago.sbformexample.entities.Customer;
import saj.mota.tiago.sbformexample.repositories.CustomerRepository;

public class CustomerController {
    
    private CustomerRepository customerRepository;
    
    @GetMapping("customer-form")
    public String customerForm(Customer customer) {
        return "customerForm";
    }

    @PostMapping("customer-save")
    public String customerSave(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customerList";
    }

    @GetMapping("customer-list")
    public String customerList(Iterable<Customer> customerList, ModelMap model) {
        customerList = customerRepository.findAll();
        model.addAttribute("customerList", customerList);
        return "customerList";
    }
}
