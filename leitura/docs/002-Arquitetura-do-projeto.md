# Arquitetura do projeto

## Arquitetura de camadas
- ``Controller``: camada de entrada. Recebe as requisições do cliente
- ``Service``: aplica as regras de negócio e chama as funcionalidades do ``Repository``
- ``Repository``: acessa o banco de dados e realiza a persistência **(utiliza interfaces)**
- ``Domain/Entity``: modelos das entidades do banco de dados
- ``DTO``: cria modelos para externar apenas informações necessárias para o cliente. Define quais propriedades das entidades serão retornadas.

## Anotações
- Controller nunca deve conter lógica complexa
- Service pode ser reutilizado por vários controllers
- A comunicação das camadas acontece da seguinte forma: 
  - Recebendo requisição: ``Controller`` -> ``Service`` -> ``Repository`` -> ``Domain`` -> ``Banco de dados``
  - Enviando a response: ``Controller`` <- ``Service`` <- ``DTO`` <- ``Repository`` <- ``Domain`` <- ``Banco de dados``