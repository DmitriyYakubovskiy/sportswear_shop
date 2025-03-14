package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.sportswear_shop.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}