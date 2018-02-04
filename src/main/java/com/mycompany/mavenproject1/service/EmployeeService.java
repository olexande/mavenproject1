package com.mycompany.mavenproject1.service;

        import com.mycompany.mavenproject1.dao.EmployeeDao;
        import com.mycompany.mavenproject1.model.Employee;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;



@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao userDao;

    public List<Employee> getAllEmployees() {
        return userDao.getAllEmployees();
    }
}
