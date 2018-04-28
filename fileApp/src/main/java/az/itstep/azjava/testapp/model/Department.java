package az.itstep.azjava.testapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    @OneToMany
    @JoinColumn(name="directory_id")
    private List<Department> departments;

}
