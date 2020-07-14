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

    public Segmento() {}

    public Segmento(String segmento) {
        this.setSegmento(segmento);
    }

    public String getSegmento (String segmento) { return segmento; }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

}


