package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task taskMaker(final String task){
        switch (task){
            case SHOPPINGTASK:
                return new ShoppingTask("shop","potatoe", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("paint", "red", "room");
            case DRIVINGTASK:
                return new DrivingTask("drive", "city", "bicycle");
            default:
                return null;
        }
    }



}
