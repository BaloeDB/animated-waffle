package dev.peter.springlink.like;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, UUID> {
    
}
