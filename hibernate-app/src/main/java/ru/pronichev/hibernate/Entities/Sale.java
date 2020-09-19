package ru.pronichev.hibernate.Entities;
/*
 * Продукт
 *
 * @author Aleksei Pronichev
 * 19.09.2020
 */

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "client_id")
    private Client client;

    @Column
    private Date date;
}
