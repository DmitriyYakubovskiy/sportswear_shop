package ru.dima.sportswear_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.dima.sportswear_shop.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p "
            + "WHERE (:name IS NULL OR p.name LIKE %:name%) "
            + "AND (:brand IS NULL OR p.brand.name LIKE %:brand%) "
            + "AND (:category IS NULL OR p.category.name LIKE %:category%) "
            + "AND (:size IS NULL OR p.size.value LIKE %:size%) "
            + "AND (:color IS NULL OR p.color LIKE %:color%) "
            + "AND (:minPrice IS NULL OR p.price >= :minPrice) "
            + "AND (:maxPrice IS NULL OR p.price <= :maxPrice)")
    List<Product> searchProducts(
            @Param("name") String name,
            @Param("brand") String brand,
            @Param("category") String category,
            @Param("size") String size,
            @Param("color") String color,
            @Param("minPrice") Double minPrice,
            @Param("maxPrice") Double maxPrice);
}
