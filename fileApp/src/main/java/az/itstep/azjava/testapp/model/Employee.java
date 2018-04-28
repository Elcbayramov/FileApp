package az.itstep.azjava.testapp.model;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import sun.util.resources.Bundles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;
    private String Surname;
    private Double salary;
    private String position;
    private Data dateOfBirth;
    private String department;



}
