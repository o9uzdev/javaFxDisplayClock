package com.o9uzdev.javaFxDisplayClock;

import javafx.scene.layout.Pane;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane(){
        getTimeString();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getTimeString(){
        return "";
    }
}
