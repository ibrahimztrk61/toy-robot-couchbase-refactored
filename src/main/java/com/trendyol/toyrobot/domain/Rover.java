package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.directions.Coordinate;
import com.trendyol.toyrobot.domain.directions.North;

import java.util.*;


public class Rover {

    private String id;
    private int x;
    private int y;
    private Compass compass;
    private List<Material> material;


    public Rover() {
        this.id = UUID.randomUUID().toString();
        this.x = 0;
        this.y = 0;
        this.compass = new North();
        this.material = new ArrayList<Material>(Arrays.asList(new Material("Ramazan")));
    }

    public Rover(int x, int y, Compass compass) {
        this.id = UUID.randomUUID().toString();
        this.x = x;
        this.y = y;
        this.compass = compass;
        this.material = new ArrayList<Material>(Arrays.asList(new Material("Muhammed")));
    }

    public void move() {
        Coordinate coordinates = new Coordinate(this.getX(),this.getY());
        coordinates = compass.move(coordinates);
        this.setX(coordinates.getX());
        this.setY(coordinates.getY());
        this.material.add(new Material(this.compass.name()));

    }

    public void turnLeft() {
        this.compass = this.compass.turnLeft();
        this.material.add(new Material(this.compass.name()));
    }


    public void turnRight() {
        this.compass = this.compass.turnRight();
        this.material.add(new Material(this.compass.name()));
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Compass getCompass() {
        return this.compass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }
}
