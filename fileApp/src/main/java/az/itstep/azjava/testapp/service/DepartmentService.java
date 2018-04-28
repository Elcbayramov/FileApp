package az.itstep.azjava.testapp.service;

import az.itstep.azjava.testapp.model.Department;
import az.itstep.azjava.testapp.model.Directory;
import az.itstep.azjava.testapp.model.Employee;
import az.itstep.azjava.testapp.model.File;

import java.util.List;

public interface DepartmentService {

    List<Directory> getAll();
    Department save(Department department);
    Department update (Department department);
    Department getOne (Integer id);
    void delete (Integer id);
    

}
