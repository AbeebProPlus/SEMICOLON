package services;

import data.dto.request.*;
import data.dto.response.*;
import data.models.Text;
import data.models.User;
import data.repositories.TextRepo;
import data.repositories.TextRepoImpl;
import data.repositories.UserRepo;
import data.repositories.UserRepoImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo = new UserRepoImpl();
    private final TextRepo textRepo = new TextRepoImpl();
    @Override
    public RegistrationResponse register(RegistrationRequest regRequest) {
        User builtUser = buildUser(regRequest);
        User savedUser = userRepo.saveUser(builtUser);
        RegistrationResponse response = builtResponse(savedUser);
        return response;
    }

    private User buildUser(RegistrationRequest registrationRequest){
        User user = new User();
        user.setUserName(registrationRequest.getUserName());
        user.setEmail(registrationRequest.getEmail());
        user.setPassword(registrationRequest.getPassword());
        return user;
    }
    private RegistrationResponse builtResponse(User user){
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setUserId(user.getId());
        registrationResponse.setStatusCode(201);
        registrationResponse.setMessage("Registration successful");
        return registrationResponse;
    }
    @Override
    public LoginResponse login(LoginRequest loginRequest){
        LoginResponse loginResponse = new LoginResponse();
        User foundUser = userRepo.findUserByUserName(loginRequest.getUserName());
        if (foundUser.getPassword().equals(loginRequest.getUserPassword())) loginResponse.setLoginMessage("Login succesful");
        else loginResponse.setLoginMessage("Authentication failed");
        return loginResponse;
    }

    @Override
    public WriteTextResponse write(WriteTextRequest writeTextRequest) {
        Text builtText = buildText(writeTextRequest);
        Text savedText = textRepo.saveText(builtText);
        WriteTextResponse response = buildTextResponse(savedText);
        return response;
    }
    private Text buildText(WriteTextRequest writeTextRequest){
        Text text = new Text();
        text.setTopic(writeTextRequest.getTopic());
        text.setMessage(writeTextRequest.getMessage());
        return text;
    }
    private WriteTextResponse buildTextResponse(Text text){
        WriteTextResponse writeTextResponse = new WriteTextResponse();
        writeTextResponse.setTextId(text.getTextId());
        writeTextResponse.setMessageStatus("Text saved successfully");
        return writeTextResponse;
    }
    @Override
    public void showMyTexts(){
        List<Text> txtRepo =  textRepo.getAllText();
        if (txtRepo.size() == 0) System.out.println("No texts available");
        for (Text textObj : txtRepo) {
            System.out.println("======================================================");
            System.out.println("id : " + textObj.getTextId());
            System.out.println("Time : " + textObj.getTextTime());
            System.out.println("Date : " + textObj.getTextDate());
            System.out.println("Topic : " + textObj.getTopic());
            System.out.println("Message:  " + textObj.getMessage());
            System.out.println("======================================================");
            System.out.println();
        }
    }

    @Override
    public EditTextResponse editText(EditTextRequest editTextRequest) {
        Text foundText = textRepo.findTextById(editTextRequest.getId());
        if (foundText.getTextId() == editTextRequest.getId()){
            foundText.setMessage(editTextRequest.getMessage());
        }
        EditTextResponse response = buildEditResponse(foundText);
        return response;
    }


    private EditTextResponse buildEditResponse(Text text){
        EditTextResponse editTextResponse = new EditTextResponse();
        editTextResponse.setId(text.getTextId());
        editTextResponse.setEditTextStatus("Text edited successfully");
        editTextResponse.setEditStatus("edited");
        return editTextResponse;
    }
    @Override
    public DeleteTextResponse deleteText(DeleteTextRequest deleteTextRequest) {
        Text foundText = textRepo.findTextById(deleteTextRequest.getTextId());
        if (foundText.getTextId() == deleteTextRequest.getTextId()){
            textRepo.deleteTextById(deleteTextRequest.getTextId());
        }
        DeleteTextResponse deleteTextResponse = buildDeleteTextResponse(foundText);
        return deleteTextResponse;
    }
    private DeleteTextResponse buildDeleteTextResponse(Text text){
        DeleteTextResponse deleteTextResponse = new DeleteTextResponse();
        deleteTextResponse.setDeletedTextId(text.getTextId());
        deleteTextResponse.setDeleteStatus("Deleted successfully");
        return deleteTextResponse;
    }
}
