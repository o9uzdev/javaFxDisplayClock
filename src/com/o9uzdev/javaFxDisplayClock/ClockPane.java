package com.o9uzdev.javaFxDisplayClock;

import javafx.scene.layout.Pane;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane(){
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
