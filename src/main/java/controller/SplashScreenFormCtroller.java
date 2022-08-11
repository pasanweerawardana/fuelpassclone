package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenFormCtroller {
    public Rectangle pgbContainer;
    public Label lblStatus;
    public Rectangle pgbLoad;

    public void initialize(){
        Timeline t1=new Timeline();
        var frame1=new KeyFrame(Duration.millis(200), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Connecting with the database............");
                pgbLoad.setWidth(pgbLoad.getWidth()+35);
            }
        });
        var frame2=new KeyFrame(Duration.millis(350), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Loading Data........!");
                pgbLoad.setWidth(pgbLoad.getWidth()+75);
            }
        });
        var frame3=new KeyFrame(Duration.millis(550), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Setting up the UI.....!");
                pgbLoad.setWidth(pgbLoad.getWidth()+175);
            }
        });
        var frame4=new KeyFrame(Duration.millis(650), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    pgbLoad.setWidth(pgbContainer.getWidth());
                    URL res = this.getClass().getResource("/view/HomeForm.fxml");
                    Parent container = FXMLLoader.load(res);
                    Scene scene=new Scene(container);
                    Stage stage=new Stage();
                    stage.setScene(scene);
                    stage.setTitle("National Fuel Pass App");
                    stage.show();
                    stage.centerOnScreen();
                    lblStatus.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.getKeyFrames().addAll(frame1,frame2,frame3,frame4);
        t1.playFromStart();
    }
}
