package data.dto.response;

import lombok.Data;

@Data
public class DeleteTextResponse {
    private int deletedTextId;
    private String deleteStatus;
}
