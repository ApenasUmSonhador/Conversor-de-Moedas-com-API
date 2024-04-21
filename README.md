# Conversor de Moedas

Este é um projeto Java que utiliza a API [ExchangeRate-API](https://v6.exchangerate-api.com) para converter valores entre diferentes moedas.

### Estrutura do Projeto

O projeto consiste em seis classes:

1. `Main`: Esta é a classe principal que inicia o programa.

2. `ApiConnection`: Esta classe é responsável por estabelecer a conexão com a API e retornar a resposta.

3. `ApiResponse`: Esta classe é um record que representa a resposta da API. Ela contém todos os campos retornados pela API.

4. `Catalog`: Esta classe é responsável por apresentar ao usuário o catálogo com as moedas e seus respectivos códigos

5. `Exchange`: Esta classe é responsável por armazenar as informações de uma operação de conversão de moeda.

6. `Reader`: Esta classe é responsável por receber inputs do usuário e fazer seu tratamento para eventuais usos durante o programa.

### Como Usar

Para usar este projeto, você precisa ter uma chave de API do [ExchangeRate-API](https://v6.exchangerate-api.com). Você pode substituir a chave de API no campo apiKey da classe ApiConnection.

Depois de substituir a chave de API, você pode executar o programa. Ele irá solicitar que você insira o código da moeda que deseja converter. Depois de inserir o código da moeda, o programa irá conectar-se à API e retornar a taxa de conversão para a moeda selecionada.

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

Contribuições são bem-vindas! Por favor, sinta-se à vontade para abrir uma issue ou solicitação pull.

### Licença

Este projeto está licenciado sob a licença MIT.
