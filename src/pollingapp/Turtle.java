package pollingapp;

public class Turtle {
    private boolean penIsUp = true;

    public boolean penIsUp() {
        return penIsUp;
    }

    public boolean movePenDown() {
        return penIsUp = false;
    }

    public void movePenUp() {
        penIsUp = true;
    }
}
