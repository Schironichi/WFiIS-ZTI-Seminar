package zti.zti_javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;

public class UiControlsViewController extends Functions {
    @FXML
    Label sliderLabel, sliderBarLabel;

    @FXML
    ProgressBar pbar;

    @FXML
    ScrollBar scbr;

    @FXML
    Slider sldr;


    @FXML
    public void initialize() {
        scbr.valueProperty().addListener(
                new ChangeListener<Number>() {

                    public void changed(ObservableValue<? extends Number >
                                                observable, Number oldValue, Number newValue)
                    {

                        sliderBarLabel.setText(String.format("%.1f", newValue));
                    }
                });

        sldr.valueProperty().addListener(
                new ChangeListener<Number>() {

                    public void changed(ObservableValue<? extends Number >
                                                observable, Number oldValue, Number newValue)
                    {

                        sliderLabel.setText(String.format("%.1f", newValue));
                    }
                });
    }

    @FXML
    public void onButtonClick() {
        pbar.setProgress((pbar.getProgress() + 0.2)%1.0);
    }
}
