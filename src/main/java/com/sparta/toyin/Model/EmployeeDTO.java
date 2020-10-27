package com.sparta.toyin.Model;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmployeeDTO {

    private String empID;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dob;
    private LocalDate dateJoined;
    private long salary;


    public EmployeeDTO(){ }

    public EmployeeDTO(String empID, String title, String firstName, String middleName, String lastName, String gender, String email, LocalDate dob, LocalDate dateJoined, long salary) {
        this.empID = empID;
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.dateJoined = dateJoined;
        this.salary = salary;
    }

    public String getEmpID() {
        return empID;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {return email; }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public long getSalary() {
        return salary;
    }

    public static LocalDate dateConverter(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
