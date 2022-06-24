# language: pt
Funcionalidade: realiza uma compra de tres itens com usuário já cadastrado


  @test
  @compra
  Cenario: Realiza uma compra no http://automationpractice.com/
    Dado que eu esteja logado com o usuario "jeff.marks@yahoo.com" senha "12345"
    Quando pesquiso o produto "Printed Chiffon Dress"
    E escolho a cor "verde"
    E escolho o tamanho "M"
    E adiciono o produto no carrinho
    Entao vejo a mensagem de sucesso: "Product successfully added to your shopping cart"


#
#  - Printed Chiffon Dress na cor verde e tamanho "M"
#  - Faded Short Sleeve T-shirts na cor azul
#  - Blouse na quantidade 2
#  - Printed Dress

