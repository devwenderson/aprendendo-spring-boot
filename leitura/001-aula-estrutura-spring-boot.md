# Aula 001 - Estrutura básica do Spring boot
- LeituraApplication.java é o ponto de entrada da aplicação
- ``@SpringBootApplication`` ativa:
  - Configuração automática
  - Escaneamento de componentes
  - Bootstrapping do Spring
- A aplicação sobe por padrão em http://localhost:8080
- Logs mostram o que o spring está configurando internamente

## Primeiro endpoint
- ``@RestController`` indica que a classe responde requisições web
- ``@GetMapping`` define uma rota do tipo `GET`

## Whitelabel Error Page

- Aparece quando não existe rota mapeada para a URL acessada
- Não é um erro da aplicação
- Significa apenas "404 - Not Found"
- Backends não têm "página inicial" por padrão

## Camadas da aplicação (monolito)

- Controller: camada de entrada (HTTP)
- Service: regras de negócio
- Controller nunca deve conter lógica complexa
- Service pode ser reutilizado por vários controllers

## Injeção de Dependência

- Classes não criam suas dependências
- Elas recebem via construtor
- Spring gerencia a criação dos objetos
- @Service e @RestController registram classes no container

## DTO - Data Transfer Object
- Expõe apenas o necessário para fora da API
- Não expõe todas as propriedades dos objetos

## JPA - Java Persistence API
- Mapeia classes Java para tabelas
- Salva objetos num banco
- Busca dados sem escrever SQL no início