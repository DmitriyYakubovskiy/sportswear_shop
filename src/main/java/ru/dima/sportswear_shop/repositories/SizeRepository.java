package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.sportswear_shop.entities.Size;

public interface SizeRepository extends JpaRepository<Size, Integer> {

}
