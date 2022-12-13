package data.models;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String email;
    private String password;
    private int id;
}
