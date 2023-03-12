package zti.zti_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onShapesButtonClick() throws IOException {
        new MainApplication().changeScene("shapes-2d-view.fxml");
    }

    @FXML
    public void onUIControlsButtonClick() throws IOException {
        new MainApplication().changeScene("ui-controls-view.fxml");
    }
}