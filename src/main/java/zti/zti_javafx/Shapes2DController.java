package zti.zti_javafx;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

//import java.io.IOException;

public class Shapes2DController extends Functions {
    @FXML
    Group grp;

@FXML
public void onDrawShapesClick() {
    // Line
    Line line = new Line();

    line.setStartX(10);
    line.setStartY(30);
    line.setEndX(335);
    line.setEndY(250);

    grp.getChildren().add(line);

    // Rectangle
    Rectangle rect = new Rectangle(305, 180);

    rect.setX(355);
    rect.setY(30);

    rect.setFill(Color.color(0.2, 0.5, 0.9));

    grp.getChildren().add(rect);

    // Circle
    Circle circ = new Circle(175, 380, 50);
    grp.getChildren().add(circ);

    // Arc
    Arc arc = new Arc(485, 400, 120, 80, 10, 120.0f);
    grp.getChildren().add(arc);
}
}
