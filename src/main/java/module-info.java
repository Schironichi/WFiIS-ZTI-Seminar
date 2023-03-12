module zti.zti_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens zti.zti_javafx to javafx.fxml;
    exports zti.zti_javafx;
}