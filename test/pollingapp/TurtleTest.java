package pollingapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void testThatTurtleIsDefault() {
        turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveDown() {
        turtle = new Turtle();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveUp() {
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanTurnRightWhenFacingEast() {}
}
