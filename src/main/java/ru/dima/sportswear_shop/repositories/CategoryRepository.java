package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.sportswear_shop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
