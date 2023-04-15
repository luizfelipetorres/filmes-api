
## API Rest de Filmes

Essa é uma API Rest simples de filmes, que permite cadastrar, visualizar, atualizar e excluir informações sobre filmes. Ela foi desenvolvida utilizando o framework Spring Boot e o banco de dados H2.

### Endpoints

A API possui os seguintes endpoints:

#### `GET /filmes`

Retorna todos os filmes cadastrados.

#### `GET /filmes/{id}`

Retorna o filme com o ID informado.

#### `POST /filmes`

Cria um novo filme com as informações fornecidas no corpo da requisição. O corpo da requisição deve estar no formato JSON e conter as seguintes informações:

```
{
    "nome": "Nome do filme",
    "sinopse": "Sinopse do filme",
    "foto": "URL da foto do filme"
}
``` 

Essas informações devem ser fornecidas por meio de um objeto do tipo `FilmeDTO`, definido em `src/main/java/com/example/filmesapi/dto/FilmeDTO.java`.

#### `PUT /filmes/{id}`

Atualiza as informações do filme com o ID informado. O corpo da requisição deve estar no formato JSON e conter as informações que serão atualizadas. Exemplo:


```
{
    "nome": "Novo nome do filme",
    "sinopse": "Nova sinopse do filme",
    "foto": "Nova URL da foto do filme"
}
``` 

Essas informações devem ser fornecidas por meio de um objeto do tipo `FilmeDTO`, definido em `src/main/java/com/example/filmesapi/dto/FilmeDTO.java`.

#### `DELETE /filmes/{id}`

Exclui o filme com o ID informado.

### Tecnologias utilizadas

A API Rest de Filmes foi desenvolvida utilizando as seguintes tecnologias:

-   Spring Boot: framework para desenvolvimento de aplicações Java.
-   H2: banco de dados em memória.
-   Maven: ferramenta de automação de compilação.

### Como executar a API

Para executar a API, é necessário ter o Java 8 e o Maven instalados em seu computador. Em seguida, siga os passos abaixo:

1.  Clone o repositório da API para seu computador: `git clone https://github.com/luizfelipetorres/filmes-api.git`
    
2.  Entre na pasta do projeto: `cd filmes-api`
    
3.  Execute o comando `mvn spring-boot:run` para iniciar a aplicação.
    
4.  A API estará disponível em `http://localhost:8080`.
    

### Considerações finais

Essa é uma API Rest simples, mas pode ser facilmente expandida para incluir novos recursos e funcionalidades. Sinta-se à vontade para usá-la como base para seus próprios projetos.
