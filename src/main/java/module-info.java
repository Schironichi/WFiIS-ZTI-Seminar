module zti.zti_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens zti.zti_javafx to javafx.fxml;
    exports zti.zti_javafx;
}