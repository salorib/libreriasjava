package com.r3.libreriasjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class JavaFXLib extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane(); // Panel
        grid.setHgap(10); // padding entre columnas
        grid.setVgap(10); // padding entre filas

        Label label = new Label("Label");
        grid.add(label, 0, 0); // Añadir el componente al panel (columna 0, fila 0)

        TextField textField = new TextField();
        textField.setText("TextField");
        grid.add(textField, 1, 0); 

        CheckBox checkBox = new CheckBox("CheckBox");
        grid.add(checkBox, 1, 1); 

        RadioButton radioButton = new RadioButton("RadioButton");
        grid.add(radioButton, 1, 2); 

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("ComboBox", "Option 2", "Option 3");
        grid.add(comboBox, 1, 3); 

        Button button = new Button("Button");
        grid.add(button, 1, 4); 

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
