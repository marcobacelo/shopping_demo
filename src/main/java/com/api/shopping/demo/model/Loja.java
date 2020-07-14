package com.api.shopping.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="loja")
public class Loja {

    @Id
    @GeneratedValue
    private int loja_number;

    @Column
    private int cnpj;

    @Column
    private String nome;

    @Column
    private int piso;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonIgnore
    private List<Segmento> segmentoList;

    @Column
    private Date data_saida;

    public Loja() {}

    public Loja(int loja_number, int cnpj, String nome, int piso, List<Segmento> segmentoList, Date data_saida) {
        this.setLoja_number(loja_number);
        this.setCnpj(cnpj);
        this.setNome(nome);
        this.setPiso(piso);
        this.setSegmentoList(segmentoList);
        this.setData_saida(data_saida);
    }

    public int getLoja_number() {
        return loja_number;
    }

    public void setLoja_number(int loja_number) {
        this.loja_number = loja_number;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public List<Segmento> getSegmentoList() {
        return segmentoList;
    }

    public void setSegmentoList(List<Segmento> segmentoList) {
        this.segmentoList = segmentoList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }
}
