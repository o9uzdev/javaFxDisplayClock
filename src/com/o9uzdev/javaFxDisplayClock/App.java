package com.o9uzdev.javaFxDisplayClock;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Create the clock and a label
        ClockPane clock = new ClockPane();
        Label lblTime = new Label(clock.getTimeString());

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblTime);
        BorderPane.setAlignment(lblTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        stage.setScene(scene);// Place the scene in the stage
        stage.setTitle("Display Clock");// Set the stage title
        stage.show();// Display the stage
    }
}
