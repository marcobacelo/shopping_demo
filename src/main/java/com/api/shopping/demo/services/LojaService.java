package com.api.shopping.demo.services;

import com.api.shopping.demo.dao.LojaDAO;
import com.api.shopping.demo.model.Loja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LojaService {

    @Autowired
    LojaDAO lojaDAO;

    public Loja add(Loja loja) {
        return lojaDAO.save(loja);
    }

    public List<Loja> add(List<Loja> loja) {
        return lojaDAO.saveAll(loja);
    }

    public List<Loja> getAllLojas() {
        return lojaDAO.findAll();
    }

    public Loja getLojaById(int id) {
        return lojaDAO.findLojaByLoja_number(id);
    }

    public Loja getLojaByCnpj(int cnpj) {
        return lojaDAO.findLojaByCnpj(cnpj);
    }
}
