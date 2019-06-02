package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_user", updatable=false)
    int id_user;

    @Column(name = "username")
    String username;

    @Column(name = "email")
    String email;

    @Column(name = "password_hash")
    String password_hash;
}
