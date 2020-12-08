package com.example.paintcalculator;

public class InteriorRoom {
    public static final int WINDOW_AREA = 16;
    public static final int DOOR_AREA = 21;
    public static final int SQ_FEET_PER_GALLON = 275;
    private double length, width, height;
    private int numDoors, numWindows;
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
    public double computeWallArea(){
        return (2 * (length * height)) + (2 *( width * height)) + (1 * (length * width));
    }
    public double getWindowDoorArea(){
        return numDoors * DOOR_AREA + numWindows * WINDOW_AREA;
    }
    public  double getPaintArea(){
        return computeWallArea() - getWindowDoorArea();
    }
    public int getGallons(){
        return (int) (Math.ceil(getPaintArea() /SQ_FEET_PER_GALLON));
    }
}
