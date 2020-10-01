package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.directions.Coordinate;

public interface Compass {

    Coordinate move(Coordinate coordinate);
    Compass turnRight();
    Compass turnLeft();
    String name();


}