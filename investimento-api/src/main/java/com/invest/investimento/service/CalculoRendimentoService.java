package com.invest.investimento.service;

import org.springframework.stereotype.Service;

import com.invest.investimento.dto.CalculoRendimentoDTO;

@Service
public class CalculoRendimentoService {

    public CalculoRendimentoDTO calcularRendimento(CalculoRendimentoDTO valor) {
        CalculoRendimentoDTO resposta = new CalculoRendimentoDTO();
        
        resposta.setRendimento(1500D);
        resposta.setValorInvestido(1000D);
        
        return resposta;
    }

}
