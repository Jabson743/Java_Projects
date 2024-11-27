package pollingapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    public void diaryIsUnlockedByDefaultState_test() {
        Diary diary = new Diary("Jabson","correctPin");
        assertTrue(diary.isUnlocked());
    }

    @Test
    public void diaryIsLocked_test() {
        Diary diary = new Diary("Jabson", "correctPin");
        assertTrue(diary.isUnlocked());
        diary.isLocked();
        assertFalse(diary.isUnlocked());
    }

    @Test
    public void diaryCannotBeUnlockedWithWrongPin_test() {
        Diary diary = new Diary("Jabson", "wrongPin");
        assertTrue(diary.isUnlocked());
        diary.isLocked();
        assertFalse(diary.isUnlocked());
    }

    @Test
    public void diaryCanBeUnLockedWithTheRightPin_test() {
        Diary diary = new Diary("Jabson","correctPin");
        diary.isUnlocked();
        assertTrue(diary.isUnlocked());
        diary.isLocked();
        assertFalse(diary.isUnlocked());
    }

    @Test
    public void entryCanBeAddedToDiaryAndDiaryIsNotEmpty_test() {
        Diary diary = new Diary("Jabson","correctPin");
        diary.isUnlocked();
        assertTrue(diary.isUnlocked());
        diary.add("title", "author");
        assertEquals(0, numberOfEntries());
    }



}