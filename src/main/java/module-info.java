module edu.farmingdale.studentdirectoryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.studentdirectoryapp to javafx.fxml;
    exports edu.farmingdale.studentdirectoryapp;
}