package services;

import data.dto.request.*;
import data.dto.response.*;

public interface UserService {
    RegistrationResponse register(RegistrationRequest regRequest);
    LoginResponse login(LoginRequest loginRequest);
    WriteTextResponse write(WriteTextRequest writeTextRequest);
    void showMyTexts();
    EditTextResponse editText(EditTextRequest editTextRequest);
    DeleteTextResponse deleteText(DeleteTextRequest deleteTextRequest);
}
