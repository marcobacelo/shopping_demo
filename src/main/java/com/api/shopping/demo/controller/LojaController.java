package com.api.shopping.demo.controller;

import com.api.shopping.demo.model.Loja;
import com.api.shopping.demo.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    LojaService lojaService;

    @GetMapping("/get_all_lojas")
    public ResponseEntity<?> get_all_lojas() {
        try {
            return ResponseEntity.ok(lojaService.getAllLojas());
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get_loja")
    public ResponseEntity<?> get_loja(@RequestParam Long id) {
        return ResponseEntity.ok(lojaService.getLojaById(id));
    }

    @PostMapping
    public ResponseEntity<Loja> create_loja(@RequestBody Loja loja) {
        try {
            lojaService.add(loja);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Loja> update_loja(@PathVariable("id") Long id, @RequestBody Loja loja) {
        try {
            return ResponseEntity.ok(lojaService.updateLoja(id, loja));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
