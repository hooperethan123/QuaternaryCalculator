package CalculatorPackage;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGUI extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Label("Test"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
