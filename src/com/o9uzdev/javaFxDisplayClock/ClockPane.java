package com.o9uzdev.javaFxDisplayClock;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.time.LocalDateTime;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane(){
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    private void setCurrentTime(){
        LocalDateTime now = LocalDateTime.now();
        hour = now.getHour();
        minute = now.getMinute();
        second = now.getSecond();
        paintClock();
    }

    public String getTimeString(){
        return "";
    }

    private void paintClock(){
        double clockRadius = Math.min(getHeight(), getWidth()) * 0.5 * 0.8;
        double centerX = getWidth()/2;
        double centerY = getHeight()/2;

        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        getChildren().clear();
        getChildren().addAll(circle);
    }

    @Override
    protected void setWidth(double value) {
        super.setWidth(value);
        paintClock();
    }

    @Override
    protected void setHeight(double value) {
        super.setHeight(value);
        paintClock();
    }
}
