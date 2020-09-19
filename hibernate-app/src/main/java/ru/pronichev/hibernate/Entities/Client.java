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
@Table(name = "clietns")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
}
