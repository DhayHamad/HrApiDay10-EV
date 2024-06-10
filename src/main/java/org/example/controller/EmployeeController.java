package org.example.controller;


import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.UriInfo;
import org.example.dao.EmployeeDAO;
import org.example.dao.JobsDAO;
import org.example.dto.JobsDto;
import org.example.models.Employees;


import java.net.URI;
import java.util.ArrayList;


@Path("/employees")
public class EmployeeController {
    EmployeeDAO dao = new EmployeeDAO();
    JobsDAO jdao= new JobsDAO();
    private UriInfo uriInfo;

    public EmployeeController() {
    }

    @GET
    public ArrayList<Employees> SELECT_ALL_EMPLOYEES() {
        try {
            return this.dao.SELECT_ALL_EMPLOYEES();
        } catch (Exception var2) {
            Exception e = var2;
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("{employee_id}")
    public Employees SELECT_ONE_EMPLOYEE(@PathParam("employee_id") int employee_id) {
        try {
            return this.dao.selectEmployee(employee_id);
        } catch (Exception var3) {
            Exception e = var3;
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("{employee_id}")
    public void DELETE_JOB(@PathParam("employee_id") int employee_id) {
        try {
            this.dao.DELETE_EMPLOYEE(employee_id);
        } catch (Exception var3) {
            Exception e = var3;
            throw new RuntimeException(e);
        }
    }

    @POST
    public void INSERT_JOB(Employees Employees) {
        try {
            this.dao.INSERT_EMPLOYEE(Employees);
        } catch (Exception var3) {
            Exception e = var3;
            throw new RuntimeException(e);
        }
    }
    private void addLinks(JobsDto dto) {
        URI selfUri = uriInfo.getAbsolutePath();
        URI empsUri = uriInfo.getAbsolutePathBuilder()
                .path(JobsController.class)
                .build();

        dto.addLink(selfUri.toString(), "self");
        dto.addLink(empsUri.toString(), "employees");
    }
    @PUT
    @Path("{employee_id}")
    public void UPDATE_JOB(@PathParam("employee_id") int employee_id, Employees employees) {
        try {
            employees.setJob_id(employee_id);
            this.dao.UPDATE_EMPLOYEE(employees);
        } catch (Exception var4) {
            Exception e = var4;
            throw new RuntimeException(e);
        }
    }
}