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

    public List<Loja> getAllLojas() {
        return lojaDAO.findAll();
    }

    public Optional<Loja> getLojaById(Long id) {
        return lojaDAO.findById(id);
    }

    public Loja getLojaByCnpj(int cnpj) {
        return lojaDAO.findLojaByCnpj(cnpj);
    }

    public Loja updateLoja(Long id, Loja loja) {
        Optional<Loja> loja_data = lojaDAO.findById(id);
        Loja _loja = loja_data.get();

        if (loja_data.isPresent()) {
            _loja = loja_data.get();
            _loja.setLoja_number(loja.getLoja_number());
            _loja.setCnpj(loja.getCnpj());
            _loja.setNome(loja.getNome());
            _loja.setSegmentoList(loja.getSegmentoList());
            _loja.setPiso(loja.getPiso());
            _loja.setData_saida(loja.getData_saida());

            add(_loja);
        }
        return _loja;
    }
}
