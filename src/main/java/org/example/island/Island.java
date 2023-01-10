package org.example.island;

public class Island {
    private final int length;
    int maxOnOneLocation= 3;
    private final int width;
    private final Location[][] locations;

    public Island(int length, int width) {
        this.length = length;
        this.width = width;
        this.locations = new Location[length][width];
    }
        public void initialize() {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    locations[i][j] = new Location(new Coordinates(i, j), maxOnOneLocation);
                }
            }
        }

}
