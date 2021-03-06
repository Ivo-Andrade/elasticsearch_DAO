package br.com.looplex.data_access_object.model;

import lombok.AllArgsConstructor;

// import javax.validation.constraints.*;

// import org.springframework.data.annotation.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
    implements IObject
{

//     @Id
//     @NotBlank(message = "Username can't be blank!")
//     @Size(min = 4, max = 256, message = "Username must be between 4 and 256 characters.")
//     @Pattern(regexp = "^[A-Za-z0-9\\-_]+$", message = "Username must contain only letters, numbers, traces and underscores")
    private String username;

//     @NotBlank(message = "Password can't be blank!")
//     @Size(min = 8, max = 256, message = "Username must be between 8 and 256 characters.")
//     @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Password must contain one uppercase letter, one lowercase letter and one number.")
    private String password;

//     @Email(message = "E-mail should be a valid address!")
    private String email;

}
