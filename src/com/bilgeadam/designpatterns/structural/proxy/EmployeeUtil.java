package com.bilgeadam.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {
    public static boolean isValidUser(String username, String password) {
        boolean isValidUser = false;
        Employee employee = getEmployeeByUsername(username);

        if(employee !=null){
            isValidUser = employee.getPassword().equals(password);
        }
        return isValidUser;
    }

    public static Employee getEmployeeByUsername(String username) {
        Map<String,Employee> map = getUsernameEmployeeMap();
        Employee employee = map.get(username);
        return employee;
    }

    public static Map<String, Employee> getUsernameEmployeeMap() {
        List<Employee> employeeList = getEmployeeList();
        Map<String,Employee> map = new LinkedHashMap<>();
        for (Employee employee:employeeList) {
            map.put(employee.getUsername(),employee);

        }
        return map;
    }

    public static List<Employee> getEmployeeList() {
        Employee Mustafa = new Employee("mustafa","123",false);
        Employee Burhan = new Employee("Burhan","1234",false);
        Employee Cemre = new Employee("Cemre","12345",true);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Mustafa);
        employeeList.add(Burhan);
        employeeList.add(Cemre);
        return employeeList;
    }
}
