package zti.zti_javafx;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.Paint;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.transform.Translate;

//import java.io.IOException;

public class Shapes2DController extends Functions {
    @FXML
    VBox vb;
    @FXML
    Group grp;

@FXML
public void onDrawShapesClick() {
    // Line
    Line line = new Line();

    line.setStartX(10);
    line.setStartY(10);
    line.setEndX(400);
    line.setEndY(100);

    grp.getChildren().add(line);

    // Rectangle
    Rectangle rect = new Rectangle(240, 140);

    rect.setX(10);
    rect.setY(110);

    rect.setFill(Color.color(0.2, 0.5, 0.9));

    grp.getChildren().add(rect);

    // Circle
    Circle circ = new Circle(60, 400, 50);
    grp.getChildren().add(circ);

    // Arc
    Arc arc = new Arc(460, 400, 120, 80, 10, 120.0f);
    grp.getChildren().add(arc);

    // 3D
    Box box = new Box();

    box.setWidth(120.0);
    box.setHeight(140.0);
    box.setDepth(100.0);

    box.setTranslateX(250);
    box.setTranslateY(500);
    box.setTranslateZ(300);

    box.setDrawMode(DrawMode.FILL); //DrawMode.LINE

    PhongMaterial mat = new PhongMaterial();
    mat.setDiffuseColor(Color.RED);
    box.setMaterial(mat);

    grp.getChildren().add(box);

    PerspectiveCamera camera = new PerspectiveCamera(false);
    camera.setTranslateX(0);
    camera.setTranslateY(0);
    camera.setTranslateZ(0);

    RotateTransition rotateTransition = new RotateTransition();
    rotateTransition.setNode(box);
    rotateTransition.setDuration(Duration.millis(1500));
    rotateTransition.setByAngle(360);
    rotateTransition.setCycleCount(50);
    rotateTransition.setAxis(new Point3D(0.02, 0.2, 0.02));
    rotateTransition.play();

    TranslateTransition translate = new TranslateTransition();
    translate.setByX(400);
    translate.setDuration(Duration.millis(1000));
    translate.setCycleCount(500);
    translate.setNode(box);
    translate.setAutoReverse(true);
    translate.play();
}
}
