package edu.farmingdale.studentdirectoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/farmingdale/studentdirectoryapp/hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("FSC CSC325_Full Stack Project");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}