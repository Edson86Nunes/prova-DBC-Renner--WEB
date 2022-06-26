# language: pt
Funcionalidade: realiza uma compra de tres itens com usuário já cadastrado

  @test
  @compra
  Cenario: Realiza a escolha de itens para compra
    Dado que eu esteja logado com o usuario "jeff.marks@yahoo.com" senha "12345"
    Quando adiciono o produto "Printed Chiffon Dress" na cor "verde" e tamanho "M"
    E adiciono o produto "Faded Short Sleeve T-shirts" na cor "azul" e tamanho "S"
    E adiciono o produto "Blouse" na cor "preto" e tamanho "S"
    E seleciono a quantidade para  "2"
    E que tenho produtos no meu carrinho
    E sigo para a pagina de endereço
    E siga para a pagina de envio
    Entao confirmo os dados de pagamento e visualizo a mensagem "Your order on My Store is complete."








