package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.Compass;
import lombok.Getter;

@Getter
public class East implements Compass {
    private String name = "EAST";
    @Override
    public Coordinate move(Coordinate coordinate) {
        Coordinate newCoordinate = new Coordinate(coordinate.getX()+1,coordinate.getY());
        return newCoordinate;
    }

    @Override
    public Compass turnRight() {
        return new South();
    }

    @Override
    public Compass turnLeft() {
        return new North();
    }
    @Override
    public String name() {
        return "EAST";
    }
}
