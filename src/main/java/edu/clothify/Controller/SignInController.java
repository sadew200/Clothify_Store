package edu.clothify.Controller;

import Model.EmployeeAccount;
import edu.clothify.Service.Custom.EmployeeAccountBO;
import edu.clothify.Service.FactoryBO;
import edu.clothify.Util.ServiceType;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class SignInController {
    public TextField txtEmail;
    public TextField txtName;
    public TextField txtPassword;
    public TextField txtID;
    private EmployeeAccountBO employeeAccountBO= FactoryBO.getInstance().getServiceType(ServiceType.EMPLOYEE_ACCOUNT);

    public void btnSignInOnAction(ActionEvent actionEvent) {
        if(employeeAccountBO.createAccount(new EmployeeAccount(txtID.getText(),txtEmail.getText(),txtName.getText(),txtPassword.getText()))){

        }
    }
}
