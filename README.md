# Checkpoint 2 - Programação Spring Boot com Persistência

## Descrição do Projeto

Este projeto foi desenvolvido para o Checkpoint 2 da disciplina de Programação Spring Boot com Persistência.

A aplicação simula o sistema de uma empresa de brinquedos para crianças de até 14 anos, permitindo realizar operações de CRUD em brinquedos.

A API foi desenvolvida utilizando Spring Boot, Maven, Java e persistência com banco de dados Oracle.

---

## Integrantes

- Enzo Monteiro Maciel - RM563734
- GABRIEL CABRAL MENDES MARIANO - RM 563230
- MATHEUS DE ALMEIDA SOUSA - RM 563557

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- Oracle Database
- Lombok
- Postman
- IntelliJ IDEA Ultimate

---

## Entidade Brinquedo

A entidade `Brinquedo` possui os seguintes campos:

- `id`
- `nome`
- `tipo`
- `classificacao`
- `tamanho`
- `preco`

---

## Endpoints da API

### Listar todos os brinquedos

**Método:** GET

**URL:**

```http
http://localhost:8080/brinquedos
```

---

### Buscar brinquedo por ID

**Método:** GET

**URL:**

```http
http://localhost:8080/brinquedos/1
```

---

### Cadastrar brinquedo

**Método:** POST

**URL:**

```http
http://localhost:8080/brinquedos
```

**Exemplo de JSON:**

```json
{
  "nome": "Carrinho Hot Wheels",
  "tipo": "Carrinho",
  "classificacao": "Livre",
  "tamanho": "Pequeno",
  "preco": 29.90
}
```

---

### Atualizar brinquedo

**Método:** PUT

**URL:**

```http
http://localhost:8080/brinquedos/1
```

**Exemplo de JSON:**

```json
{
  "nome": "Boneca Baby",
  "tipo": "Boneca",
  "classificacao": "Livre",
  "tamanho": "Medio",
  "preco": 89.90
}
```

---

### Excluir brinquedo

**Método:** DELETE

**URL:**

```http
http://localhost:8080/brinquedos/1
```

---

## Testes no Postman

### POST - Cadastrar brinquedo

Inserir aqui o print do teste POST.

---

### GET - Listar brinquedos

Inserir aqui o print do teste GET.

---

### PUT - Atualizar brinquedo

Inserir aqui o print do teste PUT.

---

### DELETE - Excluir brinquedo

Inserir aqui o print do teste DELETE.

---

### GET - Confirmação após exclusão

Inserir aqui o print do GET retornando lista vazia.

---

## Banco de Dados

A aplicação utiliza banco de dados Oracle.

A tabela criada para persistência dos dados foi:

```sql
TDS_TB_BRINQUEDOS
```

### Campos da tabela

```text
ID
NOME
TIPO
CLASSIFICACAO
TAMANHO
PRECO
```

---

## Configuração do Banco de Dados

A configuração de conexão com o banco Oracle foi realizada no arquivo `application.properties`.

Exemplo de configuração:

```properties
spring.application.name=checkpoint-brinquedos

server.port=8080

spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
spring.datasource.username=rm563734
spring.datasource.password=100406
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## Como executar o projeto

1. Clonar o repositório.
2. Abrir o projeto no IntelliJ IDEA.
3. Configurar o arquivo `application.properties` com usuário e senha do Oracle.
4. Executar a classe `CheckpointBrinquedosApplication`.
5. Testar os endpoints no Postman utilizando `localhost:8080`.

---

## Observação

A aplicação foi testada localmente utilizando o servidor Tomcat embutido do Spring Boot na porta `8080`.
