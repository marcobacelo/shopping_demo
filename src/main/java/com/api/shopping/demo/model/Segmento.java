package com.api.shopping.demo.model;

import javax.persistence.*;

@Entity
@Table(name="segmento")
public class Segmento {

    @Id
    @GeneratedValue
    int id;

    @Column
    String segmento;
}
