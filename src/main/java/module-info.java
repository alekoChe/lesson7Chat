module com.example.lesson7chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson7chat to javafx.fxml;
    exports com.example.lesson7chat;
}