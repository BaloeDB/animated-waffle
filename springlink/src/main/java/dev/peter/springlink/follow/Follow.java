package dev.peter.springlink.follow;

import java.time.LocalDateTime;
import java.util.UUID;

import dev.peter.springlink.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Follow {
    @Id
    @GeneratedValue
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private UUID id;

    @ManyToOne
    private User follower;
    @ManyToOne
    private User followed;

    private LocalDateTime followDate;
}
