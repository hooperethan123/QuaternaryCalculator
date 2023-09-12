package CalculatorPackage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class MainGUI extends Application {

    private final TextField Result = createTextField("");
    private final Button ZeroButton = createButton("0");
    private final Button OneButton = createButton("1");
    private final Button TwoButton = createButton("2");
    private final Button ThreeButton = createButton("3");
    private final Button AddButton = createButton("+");
    private final Button SubtractButton = createButton("-");
    private final Button MultiplyButton = createButton("*");
    private final Button DivideButton = createButton("/");
    private final Button EqualButton = createButton("=");
    BorderPane root;


    @Override
    public void start(Stage primaryStage){
        buildUI(primaryStage);
        configureZeroButton();
        configureOneButton();
        configureTwoButton();
        configureThreeButton();
        configureAddButton();
        configureSubtractButton();
        configureMultiplyButton();
        configureDivideButton();
        configureEqualButton();


    }

    private void createRoot(){
        root = new BorderPane();
        setRoot();
    }
    private void buildUI(Stage stage){

        createRoot();

        Scene scene = new Scene(root);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.setWidth(250);
        stage.setHeight(330);
        stage.show();
    }

    private void configureZeroButton() {


    }

    private void configureOneButton() {

    }

    private void configureTwoButton() {

    }

    private void configureThreeButton() {

    }

    private void configureAddButton() {

    }

    private void configureSubtractButton() {

    }

    private void configureMultiplyButton() {

    }

    private void configureDivideButton() {

    }

    private void configureEqualButton() {

    }



    private void setRoot() {
        VBox top = new VBox();
        top.getChildren().setAll(Result);
        top.setSpacing(25);



        HBox RowOne = new HBox();
        RowOne.getChildren().setAll(ZeroButton, OneButton, AddButton);
        RowOne.setSpacing(20);
        RowOne.setAlignment(Pos.CENTER);
        top.getChildren().add(RowOne);


        HBox RowTwo = new HBox();
        RowTwo.getChildren().setAll(TwoButton, ThreeButton, SubtractButton);
        RowTwo.setSpacing(20);
        RowTwo.setAlignment(Pos.CENTER);
        top.getChildren().add(RowTwo);


        HBox RowThree = new HBox();
        RowThree.getChildren().setAll(MultiplyButton, DivideButton, EqualButton);
        RowThree.setSpacing(20);
        RowThree.setAlignment(Pos.CENTER);
        top.getChildren().add(RowThree);

        root.setTop(top);


    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setFont(Font.font(20));
        button.setPrefSize(40,40);
        return button;
    }

    private TextField createTextField(String text){
        TextField textField = new TextField(text);
        textField.setFont(Font.font(20));
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);
        return textField;
    }
}