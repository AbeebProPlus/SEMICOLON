package data.repositories;

import data.models.User;

import java.util.List;

public interface UserRepo {
    User saveUser(User customer);

    User findUserByUserName(String userName);
    User findUserById(int id);
    List<User> getAllUsers();
    int getNumberOfUsers();
    User deactivateUser(User user);
    List<User> getAllDeactivatedUsers();
}