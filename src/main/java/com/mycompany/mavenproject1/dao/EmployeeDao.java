package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

    /**
     * Created by Max on 16.07.2017.
     */

    @Repository
    public class EmployeeDao {
        private List<Employee> employees = Arrays.asList(
                new Employee("admin", "admin"),
                new Employee("user1", "user1"));

        public List<Employee> getAllEmployees() {
            return employees;
        }
    }
