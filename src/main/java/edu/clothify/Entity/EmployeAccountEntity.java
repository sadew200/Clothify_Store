package edu.clothify.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity()
@Table(name = "EmployeAccount")
public class EmployeAccountEntity {
    @Id
    private String id;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;

}
