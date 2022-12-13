package data.repositories;

import data.models.User;
import exceptions.UserExistsException;
import exceptions.UserNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class UserRepoImplTest {
    private UserRepo userRepo;
    private User userOne;
    private User userTwo;
    private User userThree;
    private User userFour;
    @BeforeEach
    void setUp() {
        userRepo = new UserRepoImpl();
        userOne = new User();
        userTwo = new User();
        userThree = new User();
        userFour = new User();

        userOne.setUserName("Habeeb");
        userOne.setEmail("mdahlat94@gmail.com");
        userOne.setPassword("hello");

        userTwo.setUserName("Ahmad");
        userTwo.setEmail("ahmad@gmail.com");
        userTwo.setPassword("hello");

        userThree.setUserName("Habeeb");
        userThree.setEmail("mdahlat94@gmail.com");
        userThree.setPassword("hello");

        userFour.setUserName("Hab45");
        userFour.setEmail("mdahlat94@gmail.com");
        userFour.setPassword("hello");
    }


    @Test
    void testThatCustomerCanBeAddedToRepo() {
        User c1 = userRepo.saveUser(userOne);
        var customerList = userRepo.getAllUsers();
        User c2 = userRepo.saveUser(userTwo);
        assertEquals(1, c1.getId());
        assertEquals(2, c2.getId());
        assertTrue(customerList.contains(c1));
        assertTrue(customerList.contains(c2));
    }

    @Test
    void testThatExceptionIsThrownWhenTryingToRegisterWithExistingUserName(){
        User u1 = userRepo.saveUser(userOne);
        assertThrows(UserExistsException.class, ()->  userRepo.saveUser(userThree));
    }
    @Test
    void testThatExceptionIsThrownWhenTryingToRegisterWithExistingEmail(){
        User u1 = userRepo.saveUser(userOne);
        assertThrows(UserExistsException.class, ()->  userRepo.saveUser(userFour));
    }
    @Test
    void testThatUserCanBeFoundByUserName(){
        User savedUser = userRepo.saveUser(userOne);
        User secondUser = userRepo.saveUser(userTwo);
        User foundUser = userRepo.findUserByUserName("Habeeb");
        assertEquals(foundUser, savedUser);
    }
    @Test
    void testThatUserCanBeFoundByUserId(){
        User savedUser = userRepo.saveUser(userOne);
        User secondUser = userRepo.saveUser(userTwo);
        User foundUser = userRepo.findUserById(1);
        assertEquals(foundUser, savedUser);
    }
    @Test
    void testThatExceptionIsThrownWhenFindingInvalidUserName(){
        assertThrows(UserNotFoundException.class, ()-> userRepo.findUserByUserName("mderdd"));
    }
    @Test
    void testThatExceptionIsThrownWhenFindingInvalidUserId(){
        assertThrows(UserNotFoundException.class, ()-> userRepo.findUserById(2));
    }
    @Test
    void testThatUserCanBeDeactivated() {
        User savedUser = userRepo.saveUser(userOne);
        User secondUser = userRepo.saveUser(userTwo);
        var foundUser = userRepo.deactivateUser(userOne);
        List<User> users = userRepo.getAllUsers();
        List<User> deactivatedUsers = userRepo.getAllDeactivatedUsers();
        assertFalse(users.contains(foundUser));
        assertTrue(deactivatedUsers.contains(foundUser));
    }
    @Test
    void testThatExceptionIsThrownWhenDeactivatingNonUser(){
        assertThrows(UserNotFoundException.class, () -> userRepo.deactivateUser(userOne));
    }

    @Test
    void testThatTotalNumberOfUsersCanBeGotten(){
        User c1 = userRepo.saveUser(userOne);
        User c2 = userRepo.saveUser(userTwo);
        int numberOfUsers = userRepo.getNumberOfUsers();
        assertEquals(2, numberOfUsers);
    }
}