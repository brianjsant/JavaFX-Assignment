package edu.farmingdale.studentdirectoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private TextField lastNameField;
    @FXML private TextField departmentField;
    @FXML private TextField majorField;
    @FXML private TextField emailField;
    @FXML private TextField imageURLField;

    @FXML private Button clearButton;
    @FXML private Button addButton;
    @FXML private Button deleteButton;
    @FXML private Button editButton;

    @FXML public void handleClear() {
        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
        imageURLField.clear();
        System.out.println("Cleared.");
    }

    @FXML
    public void handleAdd() {
        System.out.println("Added. ");
        System.out.println("Name: " + lastNameField.getText() + ", Email: " + emailField.getText());
    }

    @FXML
    public void handleDelete() {
        System.out.println("Deleted.");
    }

    @FXML
    public void handleEdit() {
        System.out.println("Edited.");
    }

}