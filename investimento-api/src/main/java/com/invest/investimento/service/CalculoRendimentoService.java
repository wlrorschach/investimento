package com.invest.investimento.service;

import org.springframework.stereotype.Service;

import com.invest.investimento.dto.CalculoRendimentoDTO;

@Service
public class CalculoRendimentoService {

    private static final Double TAXA_SELIC = 6.4;
    private static final Double DIAS_UTEIS_ANO = 252D;
    private static final Double DIAS_UTEIS_SEMANA = 5D;

    public CalculoRendimentoDTO calcularRendimento(CalculoRendimentoDTO calc) {
        final Integer tempo = calc.getTempo();
        final Double valorInvestido = calc.getValorInvestido();
        Double rendimento = 0.0;

        if (valorInvestido != null) {
            rendimento = contabilizarRendimento(tempo, valorInvestido);
        }

        CalculoRendimentoDTO resposta = new CalculoRendimentoDTO();

        resposta.setRendimento(rendimento);
        resposta.setValorInvestido(valorInvestido);

        return resposta;
    }

    private double contabilizarRendimento(final Integer tempo, Double valorInvestido) {
        valorInvestido *= (Math.pow((1 + TAXA_SELIC / DIAS_UTEIS_ANO),
                (tempo * DIAS_UTEIS_SEMANA) / DIAS_UTEIS_ANO));

//        valorInvestido = 2;
        if (tempo > 0) {
            contabilizarRendimento(tempo - 1, valorInvestido);
        }
        return valorInvestido;

    }
}
