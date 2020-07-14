package com.api.shopping.demo.model;

import javax.persistence.*;

@Entity
@Table(name="SEGMENTO")
public class Segmento {

    @Id
    @GeneratedValue
    private
    int id;

    @Column
    private
    String segmento;

    public Segmento() {
    }

    public Segmento(String segmento) {
        this.setSegmento(segmento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
}


