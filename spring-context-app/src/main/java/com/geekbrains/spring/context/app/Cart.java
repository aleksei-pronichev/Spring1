package com.geekbrains.spring.context.app;
/*
 * Корзина
 *
 * @author Aleksei Pronichev
 * 16.09.2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private final List<Product> products;
    private ProductRepository productRepository;

    @Autowired
    public Cart() {
        this.products = new ArrayList<>();
    }

    @Autowired
    private void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean addProduct(int i) {
        Product product = productRepository.getByID(i);
        if (product == null) {
            return false;
        }
        return products.add(product);
    }

    public void removeProduct(int i) {
        products.removeIf(product -> product.getId() == i);
    }
}
