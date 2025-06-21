module com.trankhanhan.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.trankhanhan.quizapp to javafx.fxml;
    exports com.trankhanhan.quizapp;
}
