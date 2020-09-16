package com.geekbrains.spring.context.app;
/*
 * Хранилище продуктов
 *
 * @author Aleksei Pronichev
 * 16.09.2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @Autowired
    private ProductRepository() {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 2));
        productList.add(new Product(2, "Orange", 3));
        productList.add(new Product(3, "Banana", 4));
        productList.add(new Product(4, "Mango", 5));
        productList.add(new Product(5, "Potato", 1));
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public Product getByID(int i) {
        for (var product : productList) {
            if (i == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
