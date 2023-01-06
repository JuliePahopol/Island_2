package org.example;

public class Location {
    private int xPosition;
    private int yPosition;

    Plant plants;
    Herbivore herbivore;


    public void Location(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }


    public int getPositionX() {
        return xPosition;
    }

    public int getPositionY() {
        return yPosition;
    }

    public void Loc(){
        String[][] arr = new String[xPosition][yPosition];

        arr[xPosition][0] = plants.toString();
        arr[0][yPosition] = herbivore.toString();


    }

}
