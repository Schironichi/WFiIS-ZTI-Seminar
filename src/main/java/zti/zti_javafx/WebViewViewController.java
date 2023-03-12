package zti.zti_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebViewViewController extends Functions {
    @FXML
    Group grp;

    public void onWebViewButtonClick(ActionEvent actionEvent) {
        // create a webview object
        WebView w = new WebView();
        // get the web engine
        WebEngine e = w.getEngine();
        // load a website
        e.load("https://view.fis.agh.edu.pl/staff/gronek/");

        w.setPrefWidth(670);
        w.setPrefHeight(580);

        grp.getChildren().add(w);
    }
}
