package zti.zti_javafx;

import javafx.fxml.FXML;

import java.io.IOException;

public class MainMenuController {
    @FXML
    public void onShapes2DButtonClick() throws IOException {
        new MainApplication().changeScene("shapes-2d-view.fxml");
    }

    @FXML
    public void onShapes3DButtonClick() throws IOException {
        new MainApplication().changeScene("shapes-3d-view.fxml");
    }

    @FXML
    public void onUIControlsButtonClick() throws IOException {
        new MainApplication().changeScene("ui-controls-view.fxml");
    }

    @FXML
    public void onChartsButtonClick() throws IOException {
        new MainApplication().changeScene("charts-view.fxml");
    }

    @FXML
    public void onWebViewButtonClick() throws IOException {
        new MainApplication().changeScene("webview-view.fxml");
    }

    @FXML
    public void onEventsButtonClick() throws IOException {
        new MainApplication().changeScene("events-view.fxml");
    }

    @FXML
    public void onCSSButtonClick() throws IOException {
        new MainApplication().changeScene("css-view.fxml");
    }
}