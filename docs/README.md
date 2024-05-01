# Conversor de Moedas

Este é um projeto Java que utiliza a API [ExchangeRate-API](https://v6.exchangerate-api.com) para converter valores entre diferentes moedas.

### Estrutura do Projeto

O projeto consiste em 4 pacotes:

1. `[main](../src/main/)`: Onde está localizada a classe principal que inicia o programa.

2. `[api](../src/api/)`: Pacote responsável por estabelecer a conexão com a API e retornar a resposta.

3. `[classes](../src/classes/)`: Pacote onde encontram-se classes intermediárias para o programa.

4. `[utils](../src/utils/)`: Pacote onde encontram-se classes que servem como ferramentas utilizados ao longo do programa.

### Requisitos do Sistema

- Java versão 8 ou superior.
- Uma conexão com a internet.

### Como usar

1. Clone o repositório para a sua máquina local.

2. Altere o arquivo `ApiConnection.java` colocando sua apiKey em ` YOUR-API-KEY`.

3. Abra o terminal e navegue até o diretório onde o projeto foi clonado.

4. Compile o arquivo `Main.java` usando o comando `javac Main.java`.

5. Execute o programa usando o comando `java Main`.

6. O programa irá exibir um catálogo de moedas disponíveis.

7. Quando solicitado, digite o código da moeda de origem. Por exemplo, se você deseja converter de Dólares Americanos para Euros, você digitaria `USD`.

8. Em seguida, o programa irá solicitar o código da moeda de destino. Neste exemplo, você digitaria `EUR`.

9. Por fim, o programa irá solicitar o valor a ser convertido. Digite o valor que deseja converter.

10. O programa irá então conectar-se à API, realizar a conversão e exibir as informações da conversão.

Por favor, note que este programa requer uma conexão com a internet para funcionar corretamente, pois ele se conecta a uma API para obter as taxas de câmbio atualizadas.

### Dependências

Este projeto depende da geração de uma API-key [ExchangeRate-API](https://v6.exchangerate-api.com). Vá na aba [Get Free Key](https://app.exchangerate-api.com/sign-up) e faça o procedimento padrão para obter tua key.

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

- **Arthur Nunes** - _Criador_ - [Link para o perfil do GitHub](https://github.com/ApenasUmSonhador)

Veja também a lista de [contribuidores](contribuidores.md) que participaram deste projeto.

### Agradecimentos

- **Alura** - Por ministrar o curso ONE que inspirou este projeto. [Link para o site da Alura](https://www.alura.com.br)
- **Oracle** - Por sua parceria com a Alura no curso ONE. [Link para o site da Oracle](https://www.oracle.com)

### Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

### Changelog

- Versão 1.0: Lançamento inicial.
- Versão 1.1: Bugfix leitura de arquivos.
- Versão 1.2: Nova abordagem utilizando record para receber resposta da API e melhorias no README e legibilidade.
- Versão 1.3: Nova subdivisão de pacotes (utils e docs), criação de formatador de datas e README mais completo.
