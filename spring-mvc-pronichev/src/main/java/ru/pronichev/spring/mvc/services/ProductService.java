package ru.pronichev.spring.mvc.services;
/*
 * Сервис по управлению продуктами
 *
 * @author Aleksei Pronichev
 * 19.09.2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pronichev.spring.mvc.model.Product;
import ru.pronichev.spring.mvc.repositories.ProductRepository;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public void save(Product product) {
        repository.save(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getByID(int i) {
        return repository.getByID(i);
    }
}
