package Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeAccount {
    private String id;
    private String email;
    private String name;
    private String password;

}
