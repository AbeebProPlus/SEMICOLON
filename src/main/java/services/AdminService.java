package services;

import data.dto.request.DeactivateUserRequest;
import data.dto.response.DeactivateUserResponse;
import data.dto.response.DeleteTextResponse;

public interface AdminService {
    DeactivateUserResponse deactivateUsers(DeactivateUserRequest deactivateUserRequest);
}
