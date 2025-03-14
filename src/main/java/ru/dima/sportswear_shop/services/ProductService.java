package ru.dima.sportswear_shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dima.sportswear_shop.entities.Product;
import ru.dima.sportswear_shop.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> searchProducts(String name, String brand, String category, String size, String color, Double minPrice, Double maxPrice) {
        return productRepository.searchProducts(name, brand, category, size, color, minPrice, maxPrice);
    }
}
