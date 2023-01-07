package org.example;

public class Location {
    int x;
    int y;

    Object[][] location = new Object[x][y];

    public Location( Object obj){
    }

    public void setLocation(Herbivore herbivore, Carnivore carnivore) {
        location[1][y]= new Location(herbivore);
        location[x][1]= new Location(carnivore);

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
