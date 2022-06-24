# language: pt
Funcionalidade: realiza uma compra de tres itens com usuário já cadastrado



  Cenario: Realiza uma compra no http://automationpractice.com/
    Dado que eu esteja logado
    Quando preencho o cadastro com os dados:
      | CustomerName  | ContactLastName | ContactFirstName | Phone        | AddressLine1          | AddressLine2 | City         | State | PostalCode | Country | SalesRepEmployeeNumber | CreditLimit | Deleted |
      | Teste Sicredi | Teste           | Edson            | 51 9999-9999 | Av Assis Brasil, 3970 | Torre D      | Porto Alegre | RS    | 91000-000  | Brasil  | King                   | 200         |         |
    Entao eu vejo a mensagem de confirmação "Your data has been successfully stored into the database."