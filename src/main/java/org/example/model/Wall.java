package org.example.model;

public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void cteateWall() {
        System.out.println("Ceiling has been built.");
    }
}
