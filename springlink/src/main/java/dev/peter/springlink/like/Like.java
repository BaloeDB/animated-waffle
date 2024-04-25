package dev.peter.springlink.like;

import java.time.LocalDateTime;
import java.util.UUID;

import dev.peter.springlink.post.Post;
import dev.peter.springlink.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"like\"")
public class Like {
    @Id
    @GeneratedValue
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private UUID id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;

    private LocalDateTime likeDate;
}
