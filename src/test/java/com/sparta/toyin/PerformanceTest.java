package com.sparta.toyin;

import com.sparta.toyin.Controller.EmployeeDAO;
import com.sparta.toyin.Model.EmployeeDTO;
import com.sparta.toyin.Model.ReadFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class PerformanceTest {

    static long startTime;
    static long endTime;


    @Test
    @DisplayName("Testing the speed of the data Migration")
    public void dataMigrationPerformanceTest() {
        ReadFile.readFile();
    }

    @Test
    @DisplayName("Testing the speed of persistence of data to database")
    void dataPersistencePerformanceTest() {

        EmployeeDAO employeeDAO = new EmployeeDAO();
        HashMap<String, EmployeeDTO> employeeRecords = ReadFile.readFile();
        employeeDAO.setInsertEmployees(employeeRecords);

    }

}
