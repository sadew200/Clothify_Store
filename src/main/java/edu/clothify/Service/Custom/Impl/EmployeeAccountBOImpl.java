package edu.clothify.Service.Custom.Impl;

import Model.EmployeeAccount;
import edu.clothify.Service.Custom.EmployeeAccountBO;
import org.springframework.stereotype.Service;

public class EmployeeAccountBOImpl implements EmployeeAccountBO {
    @Override
    public boolean createAccount(EmployeeAccount employeeAccount) {
        return false;
    }
}
