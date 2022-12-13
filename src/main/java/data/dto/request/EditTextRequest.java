package data.dto.request;

import lombok.Data;

@Data
public class EditTextRequest {
    private int id;
    private String topic;
    private String message;
}
