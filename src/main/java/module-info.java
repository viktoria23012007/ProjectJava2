module com.example.main2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main2 to javafx.fxml;
    exports com.example.main2;
}