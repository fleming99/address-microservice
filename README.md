# Address Microservice

## Descrição

Este projeto é um microserviço para gerir endereços e todas as suas responsabilidades, desenvolvido utilizando Spring Boot. 

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **MySQL**: Utilizado como banco de dados.
- **Docker**: O banco de dados foi containerizado por ser mais ágil para testar.
- **Docker-compose**: Foi adicionado um docker-compose para a criação do banco de dados.
- **Swagger**: Documentação dos DTO's e em breve descriçao do projeto e dos endpoints. 
- **Conceitos**: Clean Code, Clean Architecture, REST.
- **WebFlux**: Para consumir a API do ViaCep, e puxar o endereço via CEP.

## Funcionalidades

A API permite as seguintes operações:

### Address

- **Create New Address**: Criar um novo endereço a partir do cep, que será utilizado para consumir a API do ViaCep e conseguir os detalhes do endereço.
- **Fetch Single Address By Id**: Buscar um endereço pelo ID, e ter como retorno a entidade completa.
- **Fetch Single AddressDto By Id**: Buscar um endereço pelo ID, e ter como retorno a entidade resumida (AddressDto).
- **Update Address**: Atualizar as informações de um endereço existente.
- **Fetch All Address**: Buscar todos os endereços cadastrados no sistema.

## Estrutura do Projeto

A estrutura do projeto segue os princípios de Clean Architecture, garantindo que o código seja modular, fácil de manter e escalável.


## Configuração do Banco de Dados

No arquivo `application.properties`, configure suas credenciais do MySQL:

```
spring.datasource.url=your_url
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Testando a API
Utilize o Swagger para testar os endpoints da API através do link:
http://localhost:8080/swagger-ui/index.html#

### Endpoints:

### Address:
- **POST** /address: Criar um novo endereço.
- **GET** /address/details/{addressId}: Buscar um endereço pelo id, e ter como retorno a entidade completa.
- **GET** /address/summary/{addressId}: Buscar um endereço pelo id, e ter como retorno a entidade resumida.
- **GET** /address/fetch-all: Buscar todos os endereços cadastrados no sistema.
- **PUT** /address/{addressId}: Atualizar um endereço existente.

  
