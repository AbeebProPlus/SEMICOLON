package data.repositories;

import data.dto.request.WriteTextRequest;
import data.models.Text;
import exceptions.TextNotFoundException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TextRepoImpl implements TextRepo{
    private final List<Text> texts = new ArrayList<>();
    private final List<Text> foundTexts = new ArrayList<>();
    @Override
    public Text saveText(Text text) {
        int textId = generateTextId();
        text.setTextId(textId);
        text.setTextDate(LocalDate.now());
        text.setTextTime(LocalTime.now());
        texts.add(text);
        return text;
    }

    @Override
    public void editTextById(int id, String message) {
        findTextById(id).setMessage(message);
    }

    @Override
    public void deleteTextById(int id) {
        for (int i = 0; i < texts.size(); i++){
            if (texts.get(i).getTextId() == id){
                texts.remove(texts.get(i));
                return;
            }
        }
        throw new TextNotFoundException(String.format("Text with id %d not found", id));
    }

    @Override
    public Text findTextById(int id) {
        for (int i = 0; i < texts.size(); i++){
            if (texts.get(i).getTextId() == id){
                return texts.get(i);
            }
        }
        throw new TextNotFoundException(String.format("Text with id %d not found", id));
    }

    @Override
    public List<Text> findTextByDate(LocalDate date) {
        for (int i = 0; i < texts.size(); i++){
            if (texts.get(i).getTextDate().equals(date)){
                foundTexts.add(texts.get(i));
            }
        }
        return foundTexts;
    }

    @Override
    public List<Text> getAllText() {
        return texts;
    }

    private int generateTextId(){
        return texts.size() + 1;
    }
}
