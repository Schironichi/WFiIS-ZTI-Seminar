package zti.zti_javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;

public class CssViewController extends Functions {
    @FXML
    Group grp;
    @FXML
    CheckBox apply_css;

    @FXML
    public void initialize() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (apply_css.isSelected()) {
                    grp.getStylesheets().add(CssViewController.class.getResource("example.css").toExternalForm());
                } else {
                    grp.getStylesheets().remove(0);
                }
            }
        };

        apply_css.setOnAction(event);
    }
}
