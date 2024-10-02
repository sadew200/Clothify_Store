package edu.clothify.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "OwnerAccount")
public class OwnerAccountEntity {
    @Id
    private String OwnerID;
    @Column(nullable = false)
    private String password;
}