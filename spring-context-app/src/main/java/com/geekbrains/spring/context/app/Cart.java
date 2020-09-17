package com.geekbrains.spring.context.app;
/*
 * Корзина
 *
 * @author Aleksei Pronichev
 * 17.09.2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@Scope("prototype")
public class Cart {
    private final Map<Product, Integer> products;
    private ProductRepository productRepository;

    @Autowired
    public Cart() {
        this.products = new HashMap<>();
    }

    @PostConstruct
    private void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(int i) {
        Product product = productRepository.getByID(i);
        products.merge(product, 1, Integer::sum);
    }

    public void removeProduct(int i) {
        products.remove(productRepository.getByID(i));
    }
}
