package com.sparta.toyin;

import com.sparta.toyin.Controller.EmployeeDAO;
import com.sparta.toyin.Model.ReadFile;

public class Task implements Runnable {
    static EmployeeDAO employeeDAO = new EmployeeDAO();


    @Override
    public void run() {
        employeeDAO.setInsertEmployees(Starter.input);
    }
    //read file first then create threads
}
