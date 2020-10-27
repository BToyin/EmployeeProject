package com.sparta.toyin;

import com.sparta.toyin.Controller.EmployeeDAO;
import com.sparta.toyin.Model.EmployeeDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EmployeeDAOTest {

    static EmployeeDAO employeeDAO;
    static EmployeeDTO employeeDTO;
    static HashMap<String, EmployeeDTO> employeeTestRecord;

    @BeforeAll
    static void setup() {
        employeeDAO = new EmployeeDAO();
        employeeDTO = new EmployeeDTO("111282","Mr.","Claude","U","Boykins","M","claude.boykins@hotmail.com",	EmployeeDTO.dateConverter("02/20/1960"),	EmployeeDTO.dateConverter("02/23/1996"),	Long.parseLong("118158"));
        employeeTestRecord = new HashMap<String, EmployeeDTO>();
        employeeTestRecord.put(employeeDTO.getEmpID(), employeeDTO);
    }


    @Test
    @DisplayName("Testing to see if 1 data record can be persisted to database successfully")
    void insertingDataTest() {
        employeeDAO.setInsertEmployees(employeeTestRecord);
        System.out.println("Please manually check the database to see if the data entry has been added");
    }





}
