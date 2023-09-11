package CalculatorPackage;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGUI extends Application{
    @Override
    public void start(Stage primaryStage){

        VBox ColumnOne = new VBox();
        ColumnOne.getChildren().add(new Label("Calculator"));


        HBox RowOne = new HBox();
        ColumnOne.getChildren().add(RowOne);

        Button ZeroButton = new Button("0");
        RowOne.getChildren().add(ZeroButton);

        Button OneButton = new Button("1");
        RowOne.getChildren().add(OneButton);

        Button TwoButton = new Button("2");
        RowOne.getChildren().add(TwoButton);

        Button ThreeButton = new Button("3");
        RowOne.getChildren().add(ThreeButton);


        HBox RowTwo = new HBox();
        ColumnOne.getChildren().add(RowTwo);

        Button AddButton = new Button("+");
        RowTwo.getChildren().add(AddButton);

        Button SubtractButton = new Button("-");
        RowTwo.getChildren().add(SubtractButton);

        Button MultiplyButton = new Button("*");
        RowTwo.getChildren().add(MultiplyButton);

        Button DivideButton = new Button("/");
        RowTwo.getChildren().add(DivideButton);

        Button EqualButton = new Button("=");
        RowTwo.getChildren().add(EqualButton);



        primaryStage.setScene(new Scene(ColumnOne));
        primaryStage.show();
    }
}
