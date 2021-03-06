package org.acme;

public class Player {
    private final String name;
    private int points = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
