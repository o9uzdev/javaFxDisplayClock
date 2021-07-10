package com.o9uzdev.javaFxDisplayClock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        String timeString = "00:00:00";
        Label lblTime = new Label(timeString);

        Scene scene = new Scene(root, 250, 250);
        stage.setScene(scene);
        stage.setTitle("Display Clock");
        stage.show();
    }
}
