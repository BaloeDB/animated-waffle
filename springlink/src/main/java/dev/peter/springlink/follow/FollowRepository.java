package dev.peter.springlink.follow;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, UUID> {
    
}
