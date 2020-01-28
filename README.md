Calculo de rendimentos
=================

Projeto para efeito de avaliacao. Executa o calculo do rendimento a partir do prazo informado e investimento semanal. 

# Pré-requisitos
* jdk-8

# Linguagem de programação
* Java

# Tecnologias utilizadas
* Spring Boot
* Java 8

# Parametros recebidos
* Json contendo:
  * "valorInvestido": valor a ser investido semanalmente;
  * "tempo" : tempo de premanencia no plano de investimento;

# Retorno
* Json contendo:
  * "valorInvestido": valor a ser investido semanalmente
  * "tempo" : tempo de premanencia no plano de investimento
  * "rendimento": valor contendo o total investido + rendimentos ao longo do tempo informado
