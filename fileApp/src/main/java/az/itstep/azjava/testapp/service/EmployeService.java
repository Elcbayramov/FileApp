package az.itstep.azjava.testapp.service;


import az.itstep.azjava.testapp.model.Employee;

import java.util.List;

public interface EmployeService {
    List<Employee> getAll();
    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee getOne(Integer id);
    void delete(Integer id);
    Employee getSalary (Double id);
}
