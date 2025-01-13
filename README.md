<h1 style="font-weight: bold;" align ="center">Cubo Network Challenge</h1>

<p align = "center">
 <a href="#started">Instruções de Instalação</a> • 
  <a href="#routes">API Endpoints</a> 
</p>

<p>
  <b>O projeto faz parte de um desafio que simula uma das tarefas de um banco. Nele temos que cadastrar novos usuários e suas informações. Na intergraão com o frontend, essas informações serão usadas para que se possa obter um gráfico com a partipação de cada usuário nas ações do banco.</b>
</p>

<h2 id="started">Instruções de Instalação</h2>

<h3>Ferramentas:</h3>

- Uma IDE habilitada para compilar código Java.
- Um banco de dados local.
- Um software de capaz de fazer as requisições http.

<h3>Clone o Projeto</h3>

No terminal digite:

```bash
https://github.com/BrendaBraganca/cubo-network-challenge
```

<h3>Variaveis de Ambiente</h2>
Em application.properties adapte o seguinte trecho:

```yaml
spring.datasource.url=jdbc:postgresql://localhost:5432/client
spring.datasource.username=your-user-name
spring.datasource.password=your-password

```

<h3>Inicializando o projeto</h3>

1. Execute o programa na sua IDE.
2. Observe em qual porta o seu programa está sendo executado (provavelmente na porta 8080)
3. Lembre-se de adicionar a rota '/clients'quando for disparar as requisições

<h3>Banco de Dados</h3>

O banco de dados utilizazado foi o Postgres e a interface utilizada para melhor acompanhar os comando utilizados na aplicaçao foi o Postico. Além disso, as atualizações do banco de dados foram feitas usando migrations.
-  <a href="https://www.youtube.com/watch?v=PShGF_udSpk&t=420s&pp=ygUdaG93IHRvIGluc3RhbGwgcG9zdGdyZXNxbCBtYWM%3D">How to Install PostgreSQL</a>
-  <a href="https://www.youtube.com/watch?v=7ROh8Mel6Cs&t=181s&pp=ygUaaG93IHRvIGluc3RhbGwgcG9zdGljbyBtYWM%3D">How to Install Postico</a>

## Contribua
1. **Clone o repositório**: `https://github.com/BrendaBraganca/receptor-gps`
2. **Crie feature/branch**: `git checkout -b feature/NAME`
## License

- [MIT](https://rem.mit-license.org)
