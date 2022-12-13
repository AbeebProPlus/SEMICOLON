package data.dto.request;

import lombok.Data;

@Data
public class WriteTextRequest {
    private String topic;
    private String message;
}
