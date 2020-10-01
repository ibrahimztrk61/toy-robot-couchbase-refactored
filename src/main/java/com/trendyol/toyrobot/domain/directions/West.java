package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.Compass;
import lombok.Getter;

@Getter
public class West implements Compass {
    private String name = "WEST";
    @Override
    public Coordinate move(Coordinate coordinate) {
        Coordinate newCoordinate = new Coordinate(coordinate.getX()-1,coordinate.getY());
        return newCoordinate;
    }

    @Override
    public Compass turnRight() {
        return new North();
    }

    @Override
    public Compass turnLeft() {
        return new South();
    }
    @Override
    public String name() {
        return "WEST";
    }
}
