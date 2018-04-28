package az.itstep.azjava.testapp.service.impl;


import az.itstep.azjava.testapp.dao.EmployeeRepository;
import az.itstep.azjava.testapp.model.Employee;
import az.itstep.azjava.testapp.service.EmployeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeService {


    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Employee getOne(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Employee getSalary(Double id) {
        return null;
    }
}
