package org.example.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesDto {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private String hire_date;
    private int job_id;
    private double salary;
    private int manager_id;
    private int department_id;
private JobsDto jobsDto;

    public EmployeesDto() {
    }



    public EmployeesDto(ResultSet rs) throws SQLException {
        this.employee_id = rs.getInt("employee_id");
        this.first_name = rs.getString("first_name");
        this.last_name = rs.getString("last_name");
        this.email = rs.getString("email");
        this.phone_number = rs.getString("phone_number");
        this.hire_date = rs.getString("hire_date");
        this.job_id = rs.getInt("job_id");
        this.salary = rs.getDouble("salary");
        this.manager_id = rs.getInt("manager_id");
        this.department_id = rs.getInt("department_id");
    }

    public int getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getHire_date() {
        return this.hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public int getJob_id() {
        return this.job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManager_id() {
        return this.manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getDepartment_id() {
        return this.department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public JobsDto getJobsDto() {
        return jobsDto;
    }

    public void setJobsDto(JobsDto jobsDto) {
        this.jobsDto = jobsDto;
    }

    @Override
    public String toString() {
        return "EmployeesDto{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", hire_date='" + hire_date + '\'' +
                ", job_id=" + job_id +
                ", salary=" + salary +
                ", manager_id=" + manager_id +
                ", department_id=" + department_id +
                ", jobsDto=" + jobsDto +
                '}';
    }
}