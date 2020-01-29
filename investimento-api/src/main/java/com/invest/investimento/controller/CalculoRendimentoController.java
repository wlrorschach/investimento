package com.invest.investimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest.investimento.dto.CalculoRendimentoDTO;
import com.invest.investimento.exception.TransactionalException;
import com.invest.investimento.service.CalculoRendimentoService;

@RequestMapping(value = "/calculo")
@RestController
public class CalculoRendimentoController {

    @Autowired
    private CalculoRendimentoService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculoRendimentoDTO> calcularRndimento(
            @RequestBody CalculoRendimentoDTO valor) {
        try {
            return ResponseEntity.ok(service.calcularRendimento(valor));
        } catch (TransactionalException e) {
            return ResponseEntity.badRequest().body(new CalculoRendimentoDTO());
        }
    }

}
