package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.directions.East;
import com.trendyol.toyrobot.domain.directions.North;
import com.trendyol.toyrobot.domain.directions.South;
import com.trendyol.toyrobot.domain.directions.West;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {


    private Compass North = new North();
    private Compass South = new South();
    private Compass West = new West();
    private Compass East = new East();


    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals(North.name(), rover.getCompass().name());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1, rover.getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals(West.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals(South.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals(East.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals(North.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_right_when_compass_is_north () {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals(East.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals(South.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals(West.name(), rover.getCompass().name());
    }

    @Test
    public void should_turn_right_when_compass_is_west () {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals(North.name(), rover.getCompass().name());
    }

    private Rover createWestRover() {
        return new Rover(0, 0, West);
    }

    private Rover createSouthRover() {
        return new Rover(0, 0, South);
    }

    private Rover createEastRover() {
        return new Rover(0, 0, East);
    }

    private Rover createNorthRover() {
        return new Rover();
    }

}
