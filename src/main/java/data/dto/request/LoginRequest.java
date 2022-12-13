package data.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String userPassword;
}
