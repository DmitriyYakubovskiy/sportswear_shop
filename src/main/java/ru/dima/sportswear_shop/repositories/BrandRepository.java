package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.sportswear_shop.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
