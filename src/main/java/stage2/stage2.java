package stage2;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class stage2 {
    private static Stage stage = new Stage();

    public void setStage2(Scene scene1, int XWON, int OWON, int DRAWS)
    {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Game Statistics");
        barChart.setLegendVisible(false);
        XYChart.Series GamesNumber = new XYChart.Series();



        GamesNumber.getData().add(new XYChart.Data("X", XWON));
        GamesNumber.getData().add(new XYChart.Data("O", OWON));
        GamesNumber.getData().add(new XYChart.Data("Draws", DRAWS));
        barChart.getData().add(GamesNumber);

        Button Close = new Button("Close");
        Close.setOnAction(e ->
                {
                    stage.close();
                    stage.setScene(scene1);
                    stage.show();
                    stage.setTitle("Tic Tac Toe");
                });
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(barChart, 0, 0);
        gridPane.add(Close, 0, 1);
        GridPane.setHalignment(Close, HPos.CENTER);
        GridPane.setValignment(Close, VPos.CENTER);



        Scene statsScene = new Scene(gridPane, 400, 450);
        stage.setTitle("Statistics");
        stage.getIcons().add(new Image("file:src/main/resources/com/example/tictactoe/icon.png"));
        stage.setResizable(false);

        stage.setScene(statsScene);
        stage.show();
    }

}
