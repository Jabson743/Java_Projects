package pollingapp;

public class Diary {
    private boolean isUnlocked = true;
    private String pin;
    private int numberOfEntries;

    public  Diary(String name, String correctPin){
        this.pin = correctPin;
    }

    public boolean isUnlocked() {
        if (isUnlocked) return isUnlocked;
        return false;
    }

    public void isLocked() {
        isUnlocked = false;
    }

    public void add(String title, String author) {
        numberOfEntries++;
    }
}
