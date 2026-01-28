# Sobre o spring

## Dependências usadas nesse projeto
- Spring Data JPA
- Thymeleaf
- Spring Web

## Anotações gerais
- <nome_do_projeto>Application.java é o ponto de entrada da aplicação
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

## Injeção de Dependência
- Classes não criam suas dependências
- Elas recebem via construtor
- Spring gerencia a criação dos objetos
- @Service e @RestController registram classes no container