package data.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class WriteTextResponse {
    private int textId;
    private String messageStatus;
}
