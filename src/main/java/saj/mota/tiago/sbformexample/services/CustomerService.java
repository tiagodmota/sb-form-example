package saj.mota.tiago.sbformexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import saj.mota.tiago.sbformexample.entities.Customer;
import saj.mota.tiago.sbformexample.repositories.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
}
