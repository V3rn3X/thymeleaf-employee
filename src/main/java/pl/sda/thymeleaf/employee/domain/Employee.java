package pl.sda.thymeleaf.employee.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@Accessors(chain = true)
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty(message = "Name should not be empty")
    private String name;
    @NotEmpty(message = "Surname should not be empty")
    private String surname;
    @Email(message = "Invalid e-mail")
    @NotEmpty(message = "E-mail should not be empty")
    private String email;
    private String pesel;
    @Max(value = 150, message = "Age has to be between 0 and 150")
    @NotNull(message = "Age is required")
    private Integer age;
}
