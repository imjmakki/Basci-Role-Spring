package app.role.rolebased.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoginCredentials {

    private String email;
    private String password;

}
