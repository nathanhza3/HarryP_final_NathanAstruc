package com.isep.visual;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class StartVue extends VBox {
    Label welcomeText = new Label("Welcome");
    TextField textField = new TextField("What is your name");
    Button welcomeButton = new Button("click me");

    Button changeButton = new Button("want to see some change");


    public StartVue(){
        welcomeText.getStyleClass().add("label");
        welcomeButton.getStyleClass().add("btn");

        this.getChildren().addAll(welcomeText, textField, welcomeButton, changeButton);
    }
}
