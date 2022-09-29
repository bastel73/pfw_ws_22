module org.djfrankymorris.pfw_1st {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.djfrankymorris.pfw_1st to javafx.fxml;
    exports org.djfrankymorris.pfw_1st;
}
