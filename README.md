# Cliente API

### Requisitos

1. JDK 8

### Rodando
1. Clone o projeto: `https://github.com/alan-hac/cliente-crud-avaliacao.git`
1. Entre na pasta `cliente-crud-avaliacao` e execute: `mvnw spring-boot:run` (windows) ou `mvn spring-boot:run` (linux) 
1. Acesse: `http://localhost:8080/clientes`

### CRUD ###
### Incluir um cliente
Endpoint: localhost:8080/clientes
Método HTTP: POST
Request Payload: 
{
	"nome":"Preencher o nome",
	"email":"Preencher o e-mail (nome@email.com)"
}

## Atualizar o nome de um cliente
Endpoint: localhost:8080/clientes
Método HTTP: PUT
Request Payload: 
{
	"id":"Preencher com Id válido",
	"nome":"Preencher novo nome"
}

## Excluir um cliente
Endpoint: localhost:8080/clientes/{Informar o ID do cliente}
Método HTTP: DELETE

## Listar os clientes cadastrados
Endpoint: localhost:8080/clientes
Método HTTP: GET