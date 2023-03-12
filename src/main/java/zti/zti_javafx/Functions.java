package zti.zti_javafx;

import javafx.fxml.FXML;

import java.io.IOException;

public class Functions {
    @FXML
    void onMainMenuClick() throws IOException {
        new MainApplication().changeScene("main-menu-view.fxml");
    }
}
