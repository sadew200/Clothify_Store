package edu.clothify.Controller;

import edu.clothify.Stater;
import javafx.event.ActionEvent;

public class IndexController {
    public void btnOwnerOnAction(ActionEvent actionEvent) {
        Stater.setUI("LoginOwner");
    }

    public void btnEmloyeOnAction(ActionEvent actionEvent) {
        Stater.setUI("LoginEmployee");
    }
}
