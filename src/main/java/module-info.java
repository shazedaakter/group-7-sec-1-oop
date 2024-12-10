module bcproject.britishcouncil {
    requires javafx.controls;
    requires javafx.fxml;


    opens bcproject.britishcouncil to javafx.fxml;
    exports bcproject.britishcouncil;
}