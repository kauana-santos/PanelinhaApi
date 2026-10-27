# Panelinha — API de Receitas

## Sobre o projeto

O **Panelinha** é uma API REST desenvolvida em Java com Spring Boot, criada para fornecer dados de receitas culinárias para uma aplicação mobile.

A API permite consultar receitas, visualizar seus ingredientes e acessar o modo de preparo de cada prato.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Lombok
- MapStruct
- SQL

## Como executar o projeto

### 1. Clone o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Acesse a pasta do projeto

```bash
cd NOME_DA_PASTA
```

### 3. Configure o banco de dados

Configure as credenciais e as propriedades de conexão no arquivo `application.properties` ou `application.yml`, conforme a configuração utilizada no projeto.

Não publique senhas ou outras credenciais no repositório.

### 4. Execute a aplicação

No Windows, utilizando o Maven Wrapper:

```bash
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Após iniciar, a API estará disponível no endereço local configurado na aplicação.

Endereço padrão, caso a porta não tenha sido alterada:

`http://localhost:8080`

## Endpoints da API

### Receitas

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/receitas` | Cria novas as receitas |
| GET | `/receitas` | Lista todas as receitas |
| GET | `/receitas/{id}` | Busca uma receita pelo ID |
| POST | `/ingredientes` | Cria novos ingredientes |
| GET | `/ingredientes/` | Lista os ingredientes |
| POST | `/modoDePreparo` | Cria o modo de preparo |
| GET | `/modoDePreparo` | Lista todos os modos de preparo |

### Exemplo de resposta

```json
{
  "id": 1,
  "titulo": "Pudim de Leite Condensado",
  "descricao": "Uma sobremesa simples e deliciosa.",
  "imagemUrl": "URL_DA_IMAGEM",
  "ingredientes": [],
  "modoDePreparo": []
}
```

Os campos e os dados retornados devem corresponder à resposta real da API.

## Integração com o aplicativo mobile

Esta API fornece os dados utilizados pelo aplicativo mobile Panelinha, desenvolvido com React Native e Expo.

O aplicativo consome os endpoints para listar as receitas e exibir seus detalhes, incluindo ingredientes e modo de preparo.



 Desenvolvido por **Kauana Santos**.
