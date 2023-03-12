package zti.zti_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("ZTI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    /**
     * Metoda changeScene zmienia scenę, czyli pokazuje nowy widok wewnątrz
     * aplikacji.
     *
     * @param fxml Nowy widok, który zostanie wyświetlony w apliakcji.
     */
    public void changeScene(String fxml) throws IOException {
        Parent new_scene = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(new_scene);
    }

    public void changeScene(Scene scene) {
        stg.setScene(scene);
    }
}