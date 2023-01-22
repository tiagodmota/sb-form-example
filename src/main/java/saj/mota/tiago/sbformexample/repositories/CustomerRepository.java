package saj.mota.tiago.sbformexample.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import saj.mota.tiago.sbformexample.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Optional<Customer> findByNameAndLastName(String name, String lastName);

    Customer findById(long id);

    List<Customer> findAll();
    
}
