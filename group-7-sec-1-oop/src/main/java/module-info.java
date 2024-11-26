module com.example.group7sec1oop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.group7sec1oop to javafx.fxml;
    exports com.example.group7sec1oop;
}