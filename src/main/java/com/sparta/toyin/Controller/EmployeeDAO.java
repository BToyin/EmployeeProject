package com.sparta.toyin.Controller;

import com.sparta.toyin.Model.EmployeeDTO;
import com.sparta.toyin.View.Log;
import com.sparta.toyin.View.Printer;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;


public class EmployeeDAO {

    private String URL = "jdbc:mysql://localhost:3306/employees";
    private Connection connection = null;
    private String insertEmployees = "INSERT INTO employees " +
            "VALUES(?,?,?,?,?,?,?,?,?,?)";
    private static int count = 0;
    private static int hasRun = 0;

    public Connection connectingToDatabase() {

        try {
            connection = DriverManager.getConnection(URL, System.getenv("java_username"), System.getenv("java_password"));
            Printer.printSuccessfulConnection();
        } catch (SQLException e) {
            Log.logException(e);
        }
        return connection;
    }

    public void setInsertEmployees(HashMap<String, EmployeeDTO> employeeRecords) {
        long startTime, endTime;

        int batchSize = 100;
        ArrayList<EmployeeDTO> employee = new ArrayList<>(employeeRecords.values());
        startTime = System.currentTimeMillis();
        try {
            PreparedStatement preparedStatement = connectingToDatabase().prepareStatement(insertEmployees);
            synchronized (this) {
                for (; count < employeeRecords.size(); count++) {
                    preparedStatement.setString(1, employee.get(count).getEmpID());
                    preparedStatement.setString(2, employee.get(count).getTitle());
                    preparedStatement.setString(3, employee.get(count).getFirstName());
                    preparedStatement.setString(4, employee.get(count).getMiddleName());
                    preparedStatement.setString(5, employee.get(count).getLastName());
                    preparedStatement.setString(6, employee.get(count).getGender());
                    preparedStatement.setString(7, employee.get(count).getEmail());
                    preparedStatement.setDate(8, Date.valueOf(employee.get(count).getDob()));
                    preparedStatement.setDate(9, Date.valueOf(employee.get(count).getDateJoined()));
                    preparedStatement.setLong(10, employee.get(count).getSalary());
                    preparedStatement.addBatch();
                    if (count % batchSize == 0) {
                        hasRun += preparedStatement.executeBatch().length;
                    }
                }
                hasRun += preparedStatement.executeBatch().length;
                if (hasRun == employeeRecords.size()){
                    endTime = System.currentTimeMillis();
                    Printer.printDataPersistenceTime(startTime,endTime);
                    Printer.printRecordsPersisted(employeeRecords.size());
                }
            }
        } catch (SQLException e) {
            Log.logException(e);
        }
    }
}
