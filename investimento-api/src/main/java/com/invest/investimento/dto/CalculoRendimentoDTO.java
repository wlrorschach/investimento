package com.invest.investimento.dto;

public class CalculoRendimentoDTO {

    private Double valorInvestido;

    private Double rendimento;

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
