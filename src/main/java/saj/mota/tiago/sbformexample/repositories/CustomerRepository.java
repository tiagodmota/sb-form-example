package saj.mota.tiago.sbformexample.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import saj.mota.tiago.sbformexample.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    List<Customer> findAll();
    
}
