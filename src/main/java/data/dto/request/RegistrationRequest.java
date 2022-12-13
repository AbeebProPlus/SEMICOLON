package data.dto.request;

import data.models.User;
import lombok.Data;

@Data
public class RegistrationRequest {
    private String userName;
    private String email;
    private String password;
}
