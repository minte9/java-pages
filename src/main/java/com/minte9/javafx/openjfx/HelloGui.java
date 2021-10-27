package com.minte9.javafx.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello.fxml"));

        stage.setTitle("Hello FXML");
        stage.setScene(new Scene(root, 300, 300));
        stage.show();
    }
}