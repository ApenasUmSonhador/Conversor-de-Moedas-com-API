# Conversor de Moedas

Este é um projeto Java que utiliza a API [ExchangeRate-API](https://v6.exchangerate-api.com) para converter valores entre diferentes moedas.

### Estrutura do Projeto

O projeto consiste em 4 pacotes:

1. `[main](../src/main/)`: Onde está localizada a classe principal que inicia o programa.

2. `[api](../src/api/)`: Pacote responsável por estabelecer a conexão com a API e retornar a resposta.

3. `[classes](../src/classes/)`: Pacote onde encontram-se classes intermediárias para o programa.

4. `[utils](../src/utils/)`: Pacote onde encontram-se classes que servem como ferramentas utilizados ao longo do programa.

### Requisitos do Sistema

* Java versão 8 ou superior.
* Uma conexão com a internet.

### Como usar

1. Clone o repositório para a sua máquina local.

2. Abra o terminal e navegue até o diretório onde o projeto foi clonado.

3. Compile o arquivo `Main.java` usando o comando `javac Main.java`.

4. Execute o programa usando o comando `java Main`.

5. O programa irá exibir um catálogo de moedas disponíveis. 

6. Quando solicitado, digite o código da moeda de origem. Por exemplo, se você deseja converter de Dólares Americanos para Euros, você digitaria `USD`.

7. Em seguida, o programa irá solicitar o código da moeda de destino. Neste exemplo, você digitaria `EUR`.

8. Por fim, o programa irá solicitar o valor a ser convertido. Digite o valor que deseja converter.

9. O programa irá então conectar-se à API, realizar a conversão e exibir as informações da conversão.

Por favor, note que este programa requer uma conexão com a internet para funcionar corretamente, pois ele se conecta a uma API para obter as taxas de câmbio atualizadas.

### Dependências

Este projeto depende da biblioteca [Gson](https://github.com/google/gson) para analisar a resposta da API. Você pode adicionar a dependência ao seu projeto Maven adicionando o seguinte ao seu arquivo pom.xml:

```xml
<dependencies>
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
  </dependency>
</dependencies>
```

### Contribuindo

Contribuições são bem-vindas! Por favor, sinta-se à vontade para abrir uma issue, solicitação pull ou escrever recomendações.

### Autores

* **Arthur Nunes** - *Criador* - [Link para o perfil do GitHub](https://github.com/ApenasUmSonhador)

Veja também a lista de [contribuidores](contribuidores.md) que participaram deste projeto.

### Agradecimentos

* **Alura** - Por ministrar o curso ONE que inspirou este projeto. [Link para o site da Alura](https://www.alura.com.br)
* **Oracle** - Por sua parceria com a Alura no curso ONE. [Link para o site da Oracle](https://www.oracle.com)

### Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

### Changelog

* Versão 1.0: Lançamento inicial.
* Versão 1.1: Bugfix leitura de arquivos.
* Versão 1.2: Nova abordagem utilizando record para receber resposta da API e melhorias no README e legibilidade.
* Versão 1.3: Nova subdivisão de pacotes (utils e docs), criação de formatador de datas e README mais completo.