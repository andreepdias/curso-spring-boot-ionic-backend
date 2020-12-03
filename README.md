# Spring Boot e Ionic - Backend

API da aplicação de gerenciamento de Pedidos (simulando um e-commerce) desenvolvida em um curso da Udemy utilizando Spring Boot e Ionic.

## Padrões adotados
* Arquitetura em camadas (Controller, Service, Domain, Repository)
* Transferência de informações com objeto de transferência de dados (DTO)
* Validação com Bean Validation (implementação do Hibernate)


## Tecnologias utlizadas

* Documentação com Swagger
* Banco de dados relacional em servidor (MySQL) e em memória (H2)
* Linguagem de query do Java Persistence (JPQL)
* Thymeleaf como template para envio de e-mails
* Segurança com Spring Security (utilizando JWT)
* Amazon Webservices S3 para hospedagem de arquivos na nuvem

## Entidades

#### Pedido
Representa um Pedido na aplicação. É composta por um conjunto de ItemPedido, uma forma de Pagamento, um Cliente, um Endereco [de entrega] e um instante de abertura (Date).#### Produto
Representa os produtos disponíveis, que possuem nome e preço.

#### Categoria
Representa uma categoria associada a um Produto, composta por um nome.

#### Item Pedido
Representa um Classe Associada entre Produto e Pedido. É composta por uma chave composta ItemPedidoPK, desconto, quantidade e preço.

#### Item Pedido PK
Representa a chave composta de ItemPedido. Composta por Pedido e Produto.

#### Pagamento
Representa um classe Abstrata de pagamento. Composta por um estado do pagamento e um Pedido.

#### Pagamento com Cartão
Implementa a classe abstrata Pagamento. Também conta com um número de parcelas.

#### Pagamento com Boleto
Implementa a classe abstrata Pagamento. Conta com data de vencimento e data de pagamento.

#### Cliente
Representa um cliente da aplicaçõ. Composto por nome, email, cpf ou cnpj, tipo, senha, conjunto de endereços e telefones.

#### Cidade
Representa uma cidade, composta por nome e Estado.

#### Estado
Representa um estado, composto por nome.
