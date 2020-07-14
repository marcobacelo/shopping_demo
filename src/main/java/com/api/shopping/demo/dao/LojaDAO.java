package com.api.shopping.demo.dao;

import com.api.shopping.demo.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LojaDAO extends JpaRepository<Loja, Long> {

    Loja findLojaByCnpj(int cnpj);

    Loja findLojaByLoja_number(int id);
}
