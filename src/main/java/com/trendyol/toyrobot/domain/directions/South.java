package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.Compass;
import lombok.Getter;

@Getter
public class South implements Compass {
    private String name = "SOUTH";

    @Override
    public Coordinate move(Coordinate coordinate) {
        Coordinate newCoordinate = new Coordinate(coordinate.getX(),coordinate.getY()-1);
        return newCoordinate;
    }

    @Override
    public Compass turnRight() {
        return new West();
    }

    @Override
    public Compass turnLeft() {
        return new East();
    }
    @Override
    public String name() {
        return "SOUTH";
    }
}
