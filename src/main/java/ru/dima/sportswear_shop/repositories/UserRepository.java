package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.sportswear_shop.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}