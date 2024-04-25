package dev.peter.springlink.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"user\"")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String username;
    private String email;
    private String passsword;
    private LocalDateTime signupDate;

    public User(String username, String email, String password, PasswordEncoder encoder) {
        this.username = username;
        this.email = email;
        this.passsword = encoder.encode(password);
        this.signupDate = LocalDateTime.now();
    }
}
