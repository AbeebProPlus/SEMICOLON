package data.dto.request;

import data.models.User;
import lombok.Data;

@Data
public class DeactivateUserRequest {
    private String userName;
}
