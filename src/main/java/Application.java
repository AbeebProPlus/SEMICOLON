import data.dto.request.*;
import data.dto.response.*;
import services.UserService;
import services.UserServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserService userService = new UserServiceImpl();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        promptUser();
    }

    private static void promptUser(){
        System.out.println("""
                Welcome. Enter a choice to continue
                1. Register
                2. Login
                3. Logout
                """);
        int intent = sc.nextInt();
        processUserIntent(intent);
    }

    private static void processUserIntent(int intent) {
        switch (intent){
            case 1:
                RegistrationRequest registrationRequest = getRegistrationDetails();
                RegistrationResponse registrationResponse = userService.register(registrationRequest);
                System.out.println(registrationResponse);
            case 2:
                LoginRequest loginRequest = getLoginDetails();
                LoginResponse loginResponse = userService.login(loginRequest);
                System.out.println(loginResponse);
                String response = "yes";
                maintainLogin(response);
            case 3:
                System.out.println("Thank you for your visit. Logged out");
                System.exit(0);
            default:
                System.exit(0);
        }
    }

    private static void maintainLogin(String response) {
        while (response.equals("yes")) {
            loginMenu();
            System.out.println("Would you like to continue");
            response = sc.next();
        }
    }

    private static RegistrationRequest getRegistrationDetails(){
        RegistrationRequest registrationRequest = new RegistrationRequest();
        System.out.println("Enter your username");
        String userName = sc.next();
        registrationRequest.setUserName(userName);
        System.out.println("Enter your email");
        String email = sc.next();
        registrationRequest.setEmail(email);
        System.out.println("Enter your password");
        String password = sc.next();
        registrationRequest.setPassword(password);
        return registrationRequest;
    }

    private static LoginRequest getLoginDetails() {
        LoginRequest loginRequest = new LoginRequest();
        try {
            System.out.println("Enter your username");
            String userName = reader.readLine();
            loginRequest.setUserName(userName);
            System.out.println("Enter your password");
            String password = reader.readLine();
            loginRequest.setUserPassword(password);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Username or password is incorrect");
        }
        return loginRequest;
    }
    private static void loginMenu(){
        System.out.println("""
                        What will you like to do? Select an option below
                        1. Write text
                        2. Edit text
                        3. Delete text
                        4. Read all text
                        5. Logout
                        """);
        try {
            int choice = Integer.parseInt(reader.readLine());
            processUserRequest(choice);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static void processUserRequest(int choice){
        switch (choice) {
            case 1 -> {
                WriteTextRequest writeTextRequest = write();
                WriteTextResponse writeTextResponse = userService.write(writeTextRequest);
                System.out.println(writeTextResponse);
            }
            case 2 -> {
                EditTextRequest editTextRequest = edit();
                EditTextResponse editTextResponse = userService.editText(editTextRequest);
                System.out.println(editTextResponse);
            }
            case 3 -> {
                DeleteTextRequest deleteTextRequest = delete();
                DeleteTextResponse deleteTextResponse = userService.deleteText(deleteTextRequest);
                System.out.println(deleteTextResponse);
            }
            case 4 -> userService.showMyTexts();
            case 5 -> System.exit(0);
            default -> loginMenu();
        }
    }
    private static WriteTextRequest write() {
        WriteTextRequest writeTextRequest = new WriteTextRequest();
        System.out.println("Enter your topic here");
        try {
            String topic = reader.readLine();
            writeTextRequest.setTopic(topic);
            System.out.println("Enter your text here");
            String message = reader.readLine();
            writeTextRequest.setMessage(message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return writeTextRequest;
    }
    private static EditTextRequest edit() {
        EditTextRequest editTextRequest = new EditTextRequest();
        try {
            System.out.println("Enter id of text to edit");
            int id = Integer.parseInt(reader.readLine());
            editTextRequest.setId(id);
            System.out.println("Enter message");
            String message = reader.readLine();
            editTextRequest.setMessage(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return editTextRequest;
    }

    private static DeleteTextRequest delete()  {
        DeleteTextRequest deleteTextRequest = new DeleteTextRequest();
        try {
            System.out.println("Enter id of text to delete");
            int id = Integer.parseInt(reader.readLine());
            deleteTextRequest.setTextId(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return deleteTextRequest;
    }
}
