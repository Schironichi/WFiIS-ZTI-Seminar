package zti.zti_javafx;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Shear;
import javafx.util.Duration;

public class Shapes3DController extends Functions {
    @FXML
    Group grp;

    @FXML
    public void onDrawShapesClick() {

        // Box + RotateTransition
        Box box = new Box();

        box.setWidth(120.0);
        box.setHeight(140.0);
        box.setDepth(100.0);

        box.setTranslateX(180);
        box.setTranslateY(160);
        box.setTranslateZ(300);

        box.setDrawMode(DrawMode.FILL);

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
        rotateTransition.setAxis(new Point3D(0.05, 0.2, 0.02));
        rotateTransition.play();

        // Cylinder + Scaling
        Cylinder cyl = new Cylinder(60, 100);

        cyl.setTranslateX(500);
        cyl.setTranslateY(160);
        cyl.setTranslateZ(300);

        cyl.setRotationAxis(new Point3D(0.05, 0.2, 0.02));
        cyl.setRotate(20);

        cyl.setDrawMode(DrawMode.LINE);

        PhongMaterial mat_2 = new PhongMaterial();
        mat_2.setDiffuseColor(Color.GREEN);
        cyl.setMaterial(mat_2);

        grp.getChildren().add(cyl);

        ScaleTransition scale = new ScaleTransition();
        scale.setByX(1.4);
        scale.setByY(0.4);
        scale.setByZ(0.2);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(500);
        scale.setNode(cyl);
        scale.setAutoReverse(true);
        scale.play();

        // Sphere + TranslationTransition
        Sphere sph = new Sphere(100);

        sph.setTranslateX(150);
        sph.setTranslateY(450);
        sph.setTranslateZ(300);

        sph.setRotationAxis(new Point3D(0.05, 0.2, 0.02));
        sph.setRotate(20);

        sph.setDrawMode(DrawMode.LINE);

        PhongMaterial mat_3 = new PhongMaterial();
        mat_3.setDiffuseColor(Color.BLUE);
        sph.setMaterial(mat_3);

        grp.getChildren().add(sph);

        TranslateTransition translate = new TranslateTransition();
        translate.setByX(50);
        translate.setByY(20);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(500);
        translate.setNode(sph);
        translate.setAutoReverse(true);
        translate.play();

        // Box + Shear
        Box box_4 = new Box();

        box_4.setWidth(120.0);
        box_4.setHeight(140.0);
        box_4.setDepth(100.0);

        box_4.setTranslateX(500);
        box_4.setTranslateY(450);
        box_4.setTranslateZ(300);

        box_4.setRotationAxis(new Point3D(0.05, 0.2, 0.02));
        box_4.setRotate(20);

        box_4.setDrawMode(DrawMode.FILL);

        PhongMaterial mat_4 = new PhongMaterial();
        mat_4.setDiffuseColor(Color.GOLD);
        box_4.setMaterial(mat_4);

        Shear shear = new Shear(0.6, 0.3);
        box_4.getTransforms().addAll(shear);

        grp.getChildren().add(box_4);
    }
}
