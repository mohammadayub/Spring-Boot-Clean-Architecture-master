package com.clean.application.employee.mapper;

import com.clean.application.employee.models.EmployeeModel;
import com.clean.domain.entity.Employee;

public class EmployeeMapper {

    public static Employee map(EmployeeModel employeeModel)
    {
        Employee employee=new Employee();
        employee.setName(employeeModel.getName());
        employee.setID(employeeModel.getID());
        return employee;
    }
}
