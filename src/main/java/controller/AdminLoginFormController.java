package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFormController {

    public PasswordField txtPassword;

    private static final String ADMIN_PASSWORD= "dep9admin";
    public AnchorPane pneAdminLogIn;

    public void txtPasswordOnAction(ActionEvent actionEvent) throws IOException {
        if (!txtPassword.getText().equals(ADMIN_PASSWORD)){
            new Alert(Alert.AlertType.ERROR,"Wrong PASSWORD").showAndWait();
            txtPassword.requestFocus();
            return;
        }
        URL resource = this.getClass().getResource("/view/ControlCemterForm.fxml");
        AnchorPane controlCenter = FXMLLoader.load(resource);
        AnchorPane pneContainer = (AnchorPane) pneAdminLogIn.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(controlCenter);
        AnchorPane.setBottomAnchor(controlCenter,0.0);
        AnchorPane.setTopAnchor(controlCenter,0.0);
        AnchorPane.setRightAnchor(controlCenter,0.0);
        AnchorPane.setLeftAnchor(controlCenter,0.0);

    }
}
