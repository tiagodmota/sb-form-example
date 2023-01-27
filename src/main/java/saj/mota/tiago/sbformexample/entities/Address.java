package saj.mota.tiago.sbformexample.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

//Lombok
@Getter
@Setter
@AllArgsConstructor
//JPA
@Entity
public class Address {
    
    //JPA
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Validation
    @NotBlank
    private String number;
    
    protected Address() { }

}
