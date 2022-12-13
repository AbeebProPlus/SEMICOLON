package data.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Text {
    private int textId;
    private String topic;
    private String message;
    private LocalDate textDate;
    private LocalTime textTime;
}
