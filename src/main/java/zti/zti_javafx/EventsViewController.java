package zti.zti_javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EventsViewController extends Functions {
    @FXML
    AnchorPane root;
    @FXML
    Group grp;
    @FXML
    public Button btn;
    @FXML
    public Label lbl_hover;
    @FXML
    public Label lbl_lshift;

    @FXML
    public void initialize() {
        EventHandler<KeyEvent> evt = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if (e.getEventType() == KeyEvent.KEY_PRESSED && e.getCode() == KeyCode.SHIFT) {
                    lbl_lshift.setStyle("-fx-text-fill: red");
                } else if (e.getEventType() == KeyEvent.KEY_RELEASED && e.getCode() == KeyCode.SHIFT) {
                    lbl_lshift.setStyle("-fx-text-fill: black");
                }
            }
        };
        lbl_lshift.setFocusTraversable(true);
        root.setOnKeyPressed(evt);
        root.setOnKeyReleased(evt);

        EventHandler<ActionEvent> btn_event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                btn.setTextFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
        };

        btn.setOnAction(btn_event);

    }

    public void onHoverEntered(MouseEvent mouseEvent) {
        lbl_hover.setFont(new Font(38));
    }

    public void onHoverExited(MouseEvent mouseEvent) {
        lbl_hover.setFont(new Font(19));
    }
}
