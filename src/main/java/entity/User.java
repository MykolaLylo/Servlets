package entity;


import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class User {
    private int user_id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Role role = Role.USER;

    public User(String name, String surname, String email, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}
