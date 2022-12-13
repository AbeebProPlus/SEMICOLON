package data.dto.response;

import lombok.Data;

@Data
public class RegistrationResponse {
    private int userId;
    private String message;
    private int statusCode;
}
