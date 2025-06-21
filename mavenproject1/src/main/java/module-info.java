module com.trankhanhan.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trankhanhan.mavenproject1 to javafx.fxml;
    exports com.trankhanhan.mavenproject1;
}
