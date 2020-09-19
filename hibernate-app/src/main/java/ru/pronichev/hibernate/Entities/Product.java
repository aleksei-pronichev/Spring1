package ru.pronichev.hibernate.Entities;
/*
 * Продукт
 *
 * @author Aleksei Pronichev
 * 19.09.2020
 */

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private int cost;
}
