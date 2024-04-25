package dev.peter.springlink.post;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostInterface extends JpaRepository<Post, UUID> {

}
