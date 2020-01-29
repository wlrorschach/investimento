Calculo de rendimentos
=================

Projeto para efeito de avaliacao. Executa o calculo do rendimento a partir do prazo informado e investimento semanal. 

# Pré-requisitos
* jdk-8

# Linguagem utilizada
* Java

# Tecnologias utilizadas
* Spring Boot
* Java 8

# Clonando o projeto
* Executar o comando no terminal do git bash: "https://github.com/wlrorschach/investimento.git"

Rodando a API
=================
* Abrir projeto e aguardar o Maven executar o download das dependências

* Em debug configurations > Maven build 
  - Criar uma nova configuração executando o comando "clean install" no campo "Goals", com o nome-build  
  - Criar uma nova configuração executando o comando "spring-boot:run" no campo "Goals" com o nome-run
* Executar o configuracao nome-build
* Executar o configuracao nome-run

# Parametros recebidos
* Json contendo:
  * "valorInvestido": valor a ser investido semanalmente;
  * "tempo" : tempo de permanencia no plano de investimento;

# Retorno
* Json contendo:
  * "valorInvestido": valor investido semanalmente
  * "tempo" : tempo de permanencia no plano de investimento
  * "rendimento": valor contendo o total investido + rendimentos ao longo do tempo informado
