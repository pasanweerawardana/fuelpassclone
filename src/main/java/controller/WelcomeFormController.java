package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WelcomeFormController {
    public AnchorPane pneRoot;

    public void initialize(){

}
    public Button btnRegister;
    public Button btnLogin;

    public void btnRegisterOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/RegisterForm.fxml");
        AnchorPane registerForm = FXMLLoader.load(resource);
        AnchorPane pneContainer=(AnchorPane) pneRoot.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(registerForm);
        AnchorPane.setBottomAnchor(registerForm,0.0);
        AnchorPane.setLeftAnchor(registerForm,0.0);
        AnchorPane.setRightAnchor(registerForm,0.0);
        AnchorPane.setTopAnchor(registerForm,0.0);
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/LoginForm.fxml");
        AnchorPane registerForm = FXMLLoader.load(resource);
        AnchorPane pneContainer=(AnchorPane) pneRoot.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(registerForm);
        AnchorPane.setBottomAnchor(registerForm,0.0);
        AnchorPane.setLeftAnchor(registerForm,0.0);
        AnchorPane.setRightAnchor(registerForm,0.0);
        AnchorPane.setTopAnchor(registerForm,0.0);
    }
}
