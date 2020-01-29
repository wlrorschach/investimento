package com.invest.investimento;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.invest.investimento.dto.CalculoRendimentoDTO;
import com.invest.investimento.service.CalculoRendimentoService;

@SpringBootTest(classes = InvestimentoApplication.class)
@RunWith(value = SpringRunner.class)
public class CalculoRendimentoTest {

    @Autowired
    private CalculoRendimentoService service;

    private static List<CalculoRendimentoDTO> valores;
    private static List<CalculoRendimentoDTO> valoresComTempoInvalido;

    @BeforeClass
    public static void criarMassa() {
        valores = new ArrayList<>();
        valoresComTempoInvalido = new ArrayList<>();
        
        valores.add(criarDto(36, 100.00));
        valores.add(criarDto(36, 250.00));
        
        valoresComTempoInvalido.add(criarDto(0, 100.00));
        valoresComTempoInvalido.add(criarDto(-1, 100.00));
    }

    @Test
    public void testarCalculo() {

        valores.forEach(it -> {
            try {
                CalculoRendimentoDTO retorno = service.calcularRendimento(it);
                Assert.assertTrue(retorno.getRendimento() != null && retorno.getRendimento() > 0);
            } catch (Exception e) {
                Assert.fail();
            }
        });
    }
    
    @Test
    public void testarTempoInvalido() {

        valoresComTempoInvalido.forEach(it -> {
            try {
                CalculoRendimentoDTO retorno = service.calcularRendimento(it);
                Assert.assertTrue(retorno.getRendimento() != null && retorno.getRendimento() == 0);
            } catch (Exception e) {
                Assert.fail();
            }
        });
    }

    private static CalculoRendimentoDTO criarDto(Integer tempo, Double valorInvestido) {
        CalculoRendimentoDTO dto = new CalculoRendimentoDTO();
        dto.setTempo(tempo);
        dto.setValorInvestido(valorInvestido);
        return dto;
    }
}
