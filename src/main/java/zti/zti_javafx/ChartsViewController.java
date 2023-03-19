package zti.zti_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.chart.*;

import java.util.Arrays;

public class ChartsViewController extends Functions {
    @FXML
    Group grp;

    public void onDrawChartsButtonClick(ActionEvent actionEvent) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Nokia", 14),
                new PieChart.Data("Samsung", 25),
                new PieChart.Data("Apple", 6),
                new PieChart.Data("Xiaomi", 22));

        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setPrefWidth(350);
        pieChart.setPrefHeight(400);
        pieChart.setTitle("PieChart Example");

        // Chart Direction
        pieChart.setClockwise(true);

        // Label Line length
        pieChart.setLabelLineLength(10);

        // Labels visibility
        pieChart.setLabelsVisible(true);

        // Chart starting angle
        pieChart.setStartAngle(180);

        grp.getChildren().add(pieChart);

        // BarChart
        // X definition
        CategoryAxis xAxis = new CategoryAxis();

        xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(
                "Sales", "Promos", "Users")));
        xAxis.setLabel("Type");

        // Y definition
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Score");

        // Bar chart creation
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("BarChart Example");

        // Data preparation
        XYChart.Series<String, Number> ser1 = new XYChart.Series<>();
        ser1.setName("Nokia");
        ser1.getData().add(new XYChart.Data<>("Sales", 21));
        ser1.getData().add(new XYChart.Data<>("Promos", 8));
        ser1.getData().add(new XYChart.Data<>("Users", 5));

        XYChart.Series<String, Number> ser2 = new XYChart.Series<>();
        ser2.setName("Samsung");
        ser2.getData().add(new XYChart.Data<>("Sales", 12));
        ser2.getData().add(new XYChart.Data<>("Promos", 9));
        ser2.getData().add(new XYChart.Data<>("Users", 7));

        XYChart.Series<String, Number> ser3 = new XYChart.Series<>();
        ser3.setName("Xiaomi");
        ser3.getData().add(new XYChart.Data<>("Sales", 34));
        ser3.getData().add(new XYChart.Data<>("Promos", 6));
        ser3.getData().add(new XYChart.Data<>("Users", 2));

        // Data insert
        barChart.getData().addAll(ser1, ser2, ser3);

        // Chart drawing and size/position settings
        barChart.setPrefWidth(350);
        barChart.setPrefHeight(400);
        barChart.setTranslateX(360);
        grp.getChildren().add(barChart);
    }
}
