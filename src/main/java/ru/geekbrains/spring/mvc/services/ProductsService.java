package ru.geekbrains.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.repositories.ProductsRepository;

import java.util.List;

@Component
public class ProductsService {
    private ProductsRepository products;

    @Autowired
    public ProductsService(ProductsRepository products) {
        this.products = products;
    }

    public List<Product> getAll() {
        return this.products.get();
    }

    public Product findById(int Id) {
        return this.products.findByID(Id);
    }
}
