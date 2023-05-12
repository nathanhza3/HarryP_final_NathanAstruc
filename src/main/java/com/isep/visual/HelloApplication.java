package com.isep.visual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        showStartScene();
    }
    public void showStartScene() {
        StartVue startVue = new StartVue();
        StartController startController = new StartController(startVue, this);
        Scene scene = new Scene(startVue,  328, 248);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void showAnotherScene() {
        AnotherVue anotherVue = new AnotherVue();
        AnotherController anotherController = new AnotherController(anotherVue);
        Scene scene = new Scene(anotherVue, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}