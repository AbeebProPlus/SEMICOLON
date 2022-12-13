package data.dto.response;

import lombok.Data;

@Data
public class DeactivateUserResponse {
    private String deactivateResponse;
    private int statusCode;
    private String userName;
}
