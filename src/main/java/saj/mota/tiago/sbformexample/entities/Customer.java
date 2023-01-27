package saj.mota.tiago.sbformexample.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

//Lombok
@Getter
@Setter
@AllArgsConstructor
//JPA
@Entity
public class Customer {
    // JPA
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //Validation
    @NotBlank
    @Size(min = 2, max = 200)
    private String name;

    //Validation
    @NotBlank
    @Size(min = 2, max = 200)
    private String lastName;

    //JPA
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_fk")
    //Validation
    @Valid
    private Address address;

    protected Customer() { }

}
