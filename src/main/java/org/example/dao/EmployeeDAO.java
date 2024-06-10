package org.example.dao;


import org.example.models.Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmployeeDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\HrApiDay10-EV\\src\\main\\java\\org\\example\\hr.db";
    private static final String SELECT_ALL_EMPLOYEES = "select * from employees";
    private static final String SELECT_ONE_EMPLOYEES_JOIN_JOBS = "select * from employees join jobs on employees.job_id = jobs.jobs_id where employees_id = ?";
    private static final String SELECT_ONE_EMPLOYEE = "select * from employees where employee_id = ?";
    private static final String INSERT_EMPLOYEE = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
    private static final String UPDATE_EMPLOYEE = "update employees set first_name = ?, last_name = ?, email = ? , phone_number = ? , hire_date = ? , job_id = ? , salary = ? , manager_id = ? , department_id = ?  where employee_id = ?";
    private static final String DELETE_EMPLOYEE = "delete from employees where employee_id = ?";

    public EmployeeDAO() {
    }

    public void INSERT_EMPLOYEE(Employees employee) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db");
        PreparedStatement st = conn.prepareStatement("insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
        st.setInt(1, employee.getEmployeesId());
        st.setString(2, employee.getFirstName());
        st.setString(3, employee.getLastName());
        st.setString(4, employee.getEmail());
        st.setString(5, employee.getPhoneNumber());
        st.setString(6, employee.getHireDate());
        st.setInt(7, employee.getJob_id());
        st.setDouble(8, employee.getSalary());
        st.setInt(9, employee.getManger_id());
        st.setInt(10, employee.getDepartment_id());
        st.executeUpdate();
    }

    public void UPDATE_EMPLOYEE(Employees employee) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db");
        PreparedStatement st = conn.prepareStatement("update employees set first_name = ?, last_name = ?, email = ? , phone_number = ? , hire_date = ? , job_id = ? , salary = ? , manager_id = ? , department_id = ?  where employee_id = ?");
        st.setInt(1, employee.getEmployeesId());
        st.setString(2, employee.getFirstName());
        st.setString(3, employee.getLastName());
        st.setString(4, employee.getEmail());
        st.setString(5, employee.getPhoneNumber());
        st.setString(6, employee.getHireDate());
        st.setInt(7, employee.getJob_id());
        st.setDouble(8, employee.getSalary());
        st.setInt(9, employee.getManger_id());
        st.setInt(10, employee.getDepartment_id());
        st.executeUpdate();
    }

    public void DELETE_EMPLOYEE(int employee_id) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db");
        PreparedStatement st = conn.prepareStatement("delete from employees where employee_id = ?");
        st.setInt(1, employee_id);
        st.executeUpdate();
    }

    public Employees selectEmployee(int employee_id) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db");
        PreparedStatement st = conn.prepareStatement("select * from employees where employee_id = ?");
        st.setInt(1, employee_id);
        ResultSet rs = st.executeQuery();
        return rs.next() ? new Employees(rs) : null;
    }

    public ArrayList<Employees> SELECT_ALL_EMPLOYEES() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db");
        PreparedStatement st = conn.prepareStatement("select * from employees");
        ResultSet rs = st.executeQuery();
        ArrayList<Employees> Employee = new ArrayList();

        while(rs.next()) {
            Employee.add(new Employees(rs));
        }

        return Employee;
    }
}
