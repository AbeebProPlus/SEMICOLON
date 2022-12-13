package data.repositories;

import data.models.Text;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface TextRepo {
    Text saveText(Text text);
    void deleteTextById(int id);
    Text findTextById(int id);
    List<Text> findTextByDate(LocalDate date);
    List<Text> getAllText();
    void editTextById(int id, String message);
}
