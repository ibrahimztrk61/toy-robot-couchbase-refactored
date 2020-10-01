package com.trendyol.toyrobot.domain.directions;

import com.trendyol.toyrobot.domain.Compass;
import lombok.Getter;

@Getter
public class North implements Compass {
    private static String name = "NORTH";

    @Override
    public Coordinate move(Coordinate coordinate) {
        Coordinate newCoordinate = new Coordinate(coordinate.getX(),coordinate.getY()+1);
        return newCoordinate;
    }

    @Override
    public Compass turnRight() {
        return new East();
    }

    @Override
    public Compass turnLeft() {
        return new West();
    }

    @Override
    public String name() {
        return name;
    }
}
