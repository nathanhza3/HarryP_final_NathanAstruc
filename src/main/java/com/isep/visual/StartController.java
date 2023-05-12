package com.isep.visual;

import java.util.Objects;

public class StartController {
    HelloApplication helloApplication;
    private StartVue startVue;

    public StartController(StartVue startVue, HelloApplication helloApplication){
        this.helloApplication = helloApplication;
        this.startVue = startVue;
        startVue.getStylesheets().add(
                Objects.requireNonNull(
                        getClass()
                                .getResource("style.css")
                ).toExternalForm());
        //startVue.welcomeButton.setOnAction(this::onWelcomeAction);
        //startVue.changeButton.setOnAction(this::changeView);
    }
}
