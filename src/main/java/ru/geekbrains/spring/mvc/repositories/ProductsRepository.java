package ru.geekbrains.spring.mvc.repositories;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring.mvc.model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class ProductsRepository {
    private List<Product> werehouse;

    @PostConstruct
    public void init() {
        Random r = new Random();
        this.werehouse = new ArrayList();
        for (int i = 0; i < 10; i++) {
            this.werehouse.add(new Product(i, "Product_" + i, 100 + (10 * r.nextDouble())));
        }
    }

    public List<Product> get() {
        return Collections.unmodifiableList(werehouse);
    }

    public Product findByID(int id) {
        for (Product p : this.werehouse) {
            if (p.getId()==id){
                return p;
            }
        }
        throw new IllegalArgumentException("Product not fond");
    }

}
