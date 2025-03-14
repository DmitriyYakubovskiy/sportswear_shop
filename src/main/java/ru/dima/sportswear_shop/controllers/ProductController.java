package ru.dima.sportswear_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dima.sportswear_shop.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productService.searchProducts("", "", "", "", "", 0.0, Double.MAX_VALUE));
        return "products";
    }

    @GetMapping("/search")
    public String searchProducts(@RequestParam(name = "name", required = false) String name,
                                 @RequestParam(name = "brand", required = false) String brand,
                                 @RequestParam(name = "category", required = false) String category,
                                 @RequestParam(name = "size", required = false) String size,
                                 @RequestParam(name = "color", required = false) String color,
                                 @RequestParam(name = "minPrice", required = false, defaultValue = "0.0") Double minPrice,
                                 @RequestParam(name = "maxPrice", required = false, defaultValue = "999999.0") Double maxPrice,
                                 Model model) {
        model.addAttribute("products", productService.searchProducts(name, brand, category, size, color, minPrice, maxPrice));
        return "products";
    }
}
