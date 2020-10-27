package com.sparta.toyin.Model;

import com.sparta.toyin.Model.EmployeeDTO;
import com.sparta.toyin.View.Log;
import com.sparta.toyin.View.Printer;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ReadFile {

    static String inputFile = "C://Users//baita//SpartaGlobal//Java Projects//EmployeesProject//EmployeesProject//resources//EmployeeRecords.csv";
//    static String inputFile = "C://Users//baita//SpartaGlobal//Java Projects//EmployeesProject//EmployeesProject//resources//EmployeeRecordsLarge.csv";
    static int counter =0;


    public static HashMap<String, EmployeeDTO>  readFile() {

        ArrayList<EmployeeDTO> employeeRecordsDuplicates = new ArrayList();
        HashMap<String,EmployeeDTO> employeeRecords = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
            //read the number of lines in the file.
            String line;
            long startTime, endTime;
            bufferedReader.readLine();
            startTime = System.currentTimeMillis();
            while ((line =bufferedReader.readLine()) != null) {
                String[] employeeDetails = line.split(",");
                EmployeeDTO employeeDTO = new EmployeeDTO(employeeDetails[0],
                        employeeDetails[1],
                        employeeDetails[2],
                        employeeDetails[3],
                        employeeDetails[4],
                        employeeDetails[5],
                        employeeDetails[6],
                        EmployeeDTO.dateConverter(employeeDetails[7]),
                        EmployeeDTO.dateConverter(employeeDetails[8]),
                        Long.parseLong(employeeDetails[9]));
                if (employeeRecords.containsKey(employeeDTO.getEmpID())){
                    employeeRecordsDuplicates.add(employeeDTO);
                } else {
                    employeeRecords.put(employeeDTO.getEmpID(),employeeDTO);
                }
            }

            endTime = System.currentTimeMillis();
            Printer.printDataMigrationTime(startTime,endTime);
            Printer.printRecords(employeeRecords.size());
            Printer.printDuplicateRecords(employeeRecordsDuplicates.size());
        }
        catch (FileNotFoundException e) {
            Log.logException(e);
        } catch (IOException e) {
            Log.logException(e);
        }
    return employeeRecords;
    }


}
