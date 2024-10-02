package edu.clothify.Service.Custom;

import Model.EmployeeAccount;
import edu.clothify.Service.SuperBO;

public interface EmployeeAccountBO extends SuperBO {
    boolean createAccount(EmployeeAccount employeeAccount);
}
