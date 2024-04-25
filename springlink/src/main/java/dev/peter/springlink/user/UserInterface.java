package dev.peter.springlink.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, UUID> {

}
