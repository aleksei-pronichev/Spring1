package ru.pronichev.spring.mvc.model;
/*
 * Продукт
 *
 * @author Aleksei Pronichev
 * 18.09.2020
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private int id;
    private String title;
    private int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
