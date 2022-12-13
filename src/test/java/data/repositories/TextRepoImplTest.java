package data.repositories;

import data.models.Text;
import exceptions.TextNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TextRepoImplTest {
    private TextRepo textRepo;
    private Text text1;
    private Text text2;
    @BeforeEach
    void setUp() {
        textRepo = new TextRepoImpl();
        text1 = new Text();
        text2 = new Text();

        text1.setTopic("My mood today");
        text1.setMessage("I am happy doing this");
        text2.setTopic("My mood yesterday");
        text2.setMessage("I am happy doing this");
    }

    @Test
    void textThatTextCanBeSaved() {
        Text txt1 = textRepo.saveText(text1);
        var texts = textRepo.getAllText();
        assertTrue(texts.contains(txt1));
    }
    @Test
    void textThatTextCanBeGottenById(){
        Text txt1 = textRepo.saveText(text1);
        Text foundText = textRepo.findTextById(1);
        assertEquals(txt1, foundText);
    }

    @Test
    void testThatTextCanBeEdited() {
        Text txt1 = textRepo.saveText(text1);
        textRepo.editTextById(1, "I am excited doing this");
        assertEquals(txt1.getMessage(), "I am excited doing this");
    }

    @Test
    void testThatTextCanBeDeletedById() {
        Text txt1 = textRepo.saveText(text1);
        Text txt2 = textRepo.saveText(text2);
        var texts = textRepo.getAllText();
        textRepo.deleteTextById(1);
        assertFalse(texts.contains(txt1));
    }
    @Test
    void testThatExceptionIsThrownWhenDeletingTextByInvalidId(){
        assertThrows(TextNotFoundException.class, ()-> textRepo.deleteTextById(3));
    }
}