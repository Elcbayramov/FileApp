package az.itstep.azjava.testapp.service.impl;


import az.itstep.azjava.testapp.dao.DepartmentRepository;
import az.itstep.azjava.testapp.dao.EmployeeRepository;
import az.itstep.azjava.testapp.model.Department;
import az.itstep.azjava.testapp.model.Directory;
import az.itstep.azjava.testapp.model.Employee;
import az.itstep.azjava.testapp.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    @Override
    public List<Directory> getAll() {
        return null;
    }

    @Override
    public Department save(Department department) {
        return null;
    }

    @Override
    public Department update(Department department) {
        return null;
    }

    @Override
    public Department getOne(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Employee> getAllSalaryFromEmployee(Integer EmployeeId) {
        return null;
    }
}
