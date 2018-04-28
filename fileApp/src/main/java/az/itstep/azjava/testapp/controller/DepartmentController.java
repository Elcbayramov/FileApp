package az.itstep.azjava.testapp.controller;



import az.itstep.azjava.testapp.model.Department;
import az.itstep.azjava.testapp.model.Directory;
import az.itstep.azjava.testapp.model.Employee;
import az.itstep.azjava.testapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/department")
public class DepartmentController {

    private DepartmentService departmentService;

    @GetMapping
    public List<Directory> getAll() {
        return departmentService.getAll();
    }

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @PutMapping
    public Department update(@RequestBody Department department) {
        return departmentService.update(department);
    }

    @GetMapping ("/{id}")
    public Department getOne(@PathVariable Integer id) {
        return departmentService.getOne(id);
    }
    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Integer id) {
        departmentService.delete(id);
    }

    @GetMapping ("/{id}/employee")
    public List<Employee> getAllSalaryFromEmployee(@PathVariable Integer EmployeeId) {
        return departmentService.getAllSalaryFromEmployee(EmployeeId);
    }

    @Autowired
    public void setDepartmentService (DepartmentService departmentService){this.departmentService =departmentService;
    }
}
