package edu.clothify.Controller;

import Model.OwnerAccount;
import edu.clothify.Service.Custom.OwnerAccountBO;
import edu.clothify.Service.FactoryBO;
import edu.clothify.Util.ServiceType;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class LoginOwnerController {
    public TextField txtOwnerID;
    public TextField txtPassword;
    private OwnerAccountBO ownerAccountBO= FactoryBO.getInstance().getServiceType(ServiceType.OWNER_ACCOUNT);

    public void btnLoginOnAction(ActionEvent actionEvent) {
        if(ownerAccountBO.isOwner(new OwnerAccount(txtOwnerID.getText(),txtPassword.getText()))){

        }
    }

    public void btnRegisterOnAction(ActionEvent actionEvent) {
    }
}
