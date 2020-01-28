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
        resposta.setTempo(tempo);

        return resposta;
    }

    private double contabilizarRendimento(final Integer tempo, Double valorInvestido) {
        Double valorTotal = 0.0;
        Integer tempoRestante = tempo;

        for (int i = 0; i < tempo; i++) {
            valorTotal += contabilizarRendimentoSemanal(tempoRestante, valorInvestido);
            tempoRestante--;
        }
        return valorTotal;
    }

    private double contabilizarRendimentoSemanal(final Integer tempo, Double valorInvestido) {
        valorInvestido *= (Math.pow((1 + TAXA_SELIC / DIAS_UTEIS_ANO),
                (tempo * DIAS_UTEIS_SEMANA) / DIAS_UTEIS_ANO));

        if (tempo > 0) {
            contabilizarRendimentoSemanal(tempo - 1, valorInvestido);
        }
        return valorInvestido;

    }
}
