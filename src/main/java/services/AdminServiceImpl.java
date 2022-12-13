package services;

import data.dto.request.DeactivateUserRequest;
import data.dto.response.DeactivateUserResponse;
import data.models.User;
import data.repositories.UserRepo;
import data.repositories.UserRepoImpl;

public class AdminServiceImpl implements AdminService{
    private final UserRepo userRepo = new UserRepoImpl();
    @Override
    public DeactivateUserResponse deactivateUsers(DeactivateUserRequest deactivateUserRequest) {
        User userToBeDeactivated = buildUser(deactivateUserRequest);
        User deactivatedUser = userRepo.deactivateUser(userToBeDeactivated);
        DeactivateUserResponse deactivateUserResponse = buildResponse(deactivatedUser);
        return deactivateUserResponse;
    }

    private User buildUser(DeactivateUserRequest deactivateUserRequest){
       User user = new User();
       user.setUserName(deactivateUserRequest.getUserName());
       return user;
    }
    private DeactivateUserResponse buildResponse(User user){
        DeactivateUserResponse deactivateUserResponse = new DeactivateUserResponse();
        deactivateUserResponse.setUserName(user.getUserName());
        deactivateUserResponse.setDeactivateResponse(String.format("User with username %s deactivated successfully" +
                "", user.getUserName()));
        deactivateUserResponse.setStatusCode(201);
        return deactivateUserResponse;
    }
}
