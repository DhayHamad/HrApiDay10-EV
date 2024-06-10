package org.example.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employees {

    private int employeesId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private int job_id;
    private double salary;
    private int manger_id;
    private int department_id;
    private Jobs job;

    public Employees() {
    }

    public Employees(ResultSet rs) throws SQLException {
        employeesId = rs.getInt("employee_id");
        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        email = rs.getString("email");
        phoneNumber = rs.getString("phone_number");
        hireDate = rs.getString("hire_date");
        salary = rs.getDouble("salary");
    }

    public Employees(int employeesId, String firstName, String lastName, String email, String phoneNumber, String hireDate, int job_id, double salary, int manger_id, int department_id, Jobs job) {
        this.employeesId = employeesId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.job_id = job_id;
        this.salary = salary;
        this.manger_id = manger_id;
        this.department_id = department_id;
        this.job = job;
    }

    public int getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManger_id() {
        return manger_id;
    }

    public void setManger_id(int manger_id) {
        this.manger_id = manger_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }
}
