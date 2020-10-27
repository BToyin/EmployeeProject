package com.sparta.toyin;

import com.sparta.toyin.Model.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeDTOTest {

    @Test
    @DisplayName("Testing the date conversion method")
    void dateConverterTest(){
        Assertions.assertEquals("1996-10-23", EmployeeDTO.dateConverter("10/23/1996").toString());
        Assertions.assertEquals("1996-01-02", EmployeeDTO.dateConverter("1/2/1996").toString());
    }

}
