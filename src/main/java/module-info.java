module com.example.lab2_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2_javafx to javafx.fxml;
    exports com.example.lab2_javafx;
}