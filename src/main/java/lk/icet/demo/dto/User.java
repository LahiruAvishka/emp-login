package lk.icet.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private String role;
}
