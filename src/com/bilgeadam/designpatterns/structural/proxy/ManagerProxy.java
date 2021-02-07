package com.bilgeadam.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class ManagerProxy implements ICompanyInfo{
    private  RealManager realManager;

    private String username;
    private String password;

    public ManagerProxy(String username, String password) {
        this.username = username;
        this.password = password;
        this.realManager = new RealManager();
    }
    private boolean isUserManager(){
        boolean isUserManager = false;
        boolean isValidUser = EmployeeUtil.isValidUser(username,password);
        if(isValidUser){
            Employee employee = EmployeeUtil.getEmployeeByUsername(username);
            isUserManager = employee.isManager();
        }
        return isUserManager;
    }

    @Override
    public BigDecimal getCiro() throws IllegalAccessException {
        boolean isUSerManager = isUserManager();
        if(isUSerManager){
            return  realManager.getCiro();
        }else{
            throw new IllegalAccessException();
        }
    }
}
