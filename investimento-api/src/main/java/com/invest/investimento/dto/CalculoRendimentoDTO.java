package com.invest.investimento.dto;

import java.io.Serializable;

public class CalculoRendimentoDTO implements Serializable {
    private static final long serialVersionUID = 403012794787837634L;

    private Double valorInvestido;

    private Double rendimento;

    private Integer tempo;

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public CalculoRendimentoDTO() {
    }

    public CalculoRendimentoDTO(Double valorInvestido, Double rendimento) {
        this.valorInvestido = valorInvestido;
        this.rendimento = rendimento;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getRendimento() {
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

}
