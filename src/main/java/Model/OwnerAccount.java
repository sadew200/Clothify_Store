package Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OwnerAccount {
    private String OwnerID;
    private String password;
}
