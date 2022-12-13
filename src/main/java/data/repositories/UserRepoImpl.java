package data.repositories;

import data.models.User;
import exceptions.UserExistsException;
import exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepo {
    private final List<User> users = new ArrayList<>();
    private final List<User> deactivatedUsers = new ArrayList<>();
    @Override
    public User saveUser(User user) {
        checkIfUserNameExists(user);
        checkIfUserEmailExists(user);
        int userId = generateUserId();
        user.setId(userId);
        users.add(user);
        return user;
    }

    private void checkIfUserNameExists(User newUser){
        for (User user : users) {
            if (user.getUserName().equals(newUser.getUserName())) {
                throw new UserExistsException(String.format("User with userName %s already exists", newUser.getUserName()));
            }
        }
    }
    private void checkIfUserEmailExists(User newUser){
        for (User user : users) {
            if (user.getEmail().equals(newUser.getEmail())) {
                throw new UserExistsException(String.format("User with email %s already exists", newUser.getEmail()));
            }
        }
    }


    @Override
    public User findUserByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) return user;
        }
       throw new UserNotFoundException(String.format("User with userName %s not found", userName));
    }

    @Override
    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == 1) return user;
        }
        throw new UserNotFoundException(String.format("User with %d not found", id));
    }

    @Override
    public int getNumberOfUsers() {
        return users.size();
    }

    @Override
    public User deactivateUser(User user) {
        User user2 = user;
        deactivatedUsers.add(user);
        for (User usr : users){
            if (usr.getUserName().equals(user.getUserName())){
                users.remove(usr);
                return user2;
            }
        }
        throw new UserNotFoundException("User doesn't exist");
    }

    @Override
    public List<User> getAllDeactivatedUsers(){
        return deactivatedUsers;
    }
    @Override
    public List<User> getAllUsers(){
        return users;
    }
    private int generateUserId(){
        return users.size() + 1;
    }
}
