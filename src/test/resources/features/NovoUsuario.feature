#language: pt
#enconding: UTF-8

Funcionalidade: Cadastra novo usário
  @test
  @cadastro
  Cenario: Realiza cadastro de novo usuario
    Dado que eu esteja na pagina de autenticacao do site
    Quando insiro um email valido
    E clico em Create an accont  sou direcionado para pagina de cadastro de usuario
    E preencho os dados obrigatórios
      | campoPrimeiroNome | campoSegundoNome | campoSenha | campoDia | campoMeses | campoAno | campoEndereco | campoCidade | campoestado | campoCEP | campoPais     |telefoneCelular|
      | Teste             | Silva            | 12345      | 29       | June       | 1987     | Rua Testere   | Floripa     | Alabama     | 00000    | United States |5547999999999  |
    Entao clico em Register e sou direcionado para a pagina da minha conta