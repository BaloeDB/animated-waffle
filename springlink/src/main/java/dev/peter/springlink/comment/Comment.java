package dev.peter.springlink.comment;

import java.time.LocalDateTime;
import java.util.UUID;

import dev.peter.springlink.post.Post;
import dev.peter.springlink.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private UUID id = null;
    
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;

    private String content;
    private LocalDateTime commentDate;
}
