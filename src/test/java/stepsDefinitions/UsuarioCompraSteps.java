package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AuthenticationPage;
import pageObjects.MyAccountPage;
import pageObjects.ShoppingCartPage;
import static utils.Configs.*;

public class UsuarioCompraSteps {
    @Dado("que eu esteja logado com o usuario {string} senha {string}")
    public void queEuEstejaLogadoComOUsuarioSenha(String email, String passwd) {
        abrirSistema();
        Na(AuthenticationPage.class).preencherLogin(email);
        Na(AuthenticationPage.class).preencherSenha(passwd);
        Na(AuthenticationPage.class).clicaBtnLogin();
        }

    @Quando("adiciono o produto {string} na cor {string} e tamanho {string}")
    public void pesquisoOProduto(String produto, String cor,String tamanho) {
        Na(MyAccountPage.class).preencheProduto(produto);
        Na(MyAccountPage.class).pesquisaProduto();
        switch (cor){
            case "verde":
                Na(MyAccountPage.class).selecionaCorVerde();
                break;
            case "azul":
                Na(MyAccountPage.class).selecionaCorAzul();
                break;
            case "preto":
                Na(MyAccountPage.class).selecionaCorPreto();
                break;
        }
        Na(MyAccountPage.class).selecionaTamanho(tamanho);

        Na(MyAccountPage.class).adicionaCarrinho();
        Na(MyAccountPage.class).continuaCompras();

    }
    
    @E("seleciono a quantidade para  {string}")
    public void selecionoAQuantidadePara(String qtd)  {
        Na(MyAccountPage.class).selecionaQuantidade(qtd);
    }

    @E("que tenho produtos no meu carrinho")
    public void queTenhoProdutosNoMeuCarrinho() {
        Na(MyAccountPage.class).abreCarrinho();
        Na(ShoppingCartPage.class).validaPgResumoCarrinho();
        Na(ShoppingCartPage.class).validarProdutos();
    }

    @E("sigo para a pagina de endereco")
    public void sigoParaAPaginaDeEndereco(){
        Na(ShoppingCartPage.class).clicaProsseguirPgResumo();
        Na(ShoppingCartPage.class).validaPgEndereco();
        Na(ShoppingCartPage.class).clicaProsseguirPgEndereco();
    }

    @E("siga para a pagina de envio")
    public void sigaParaAPaginaDeEnvio() {
        Na(ShoppingCartPage.class).validaPgEnvioCarrinho();
        Na(ShoppingCartPage.class).selecionaTermosEnvio();
        Na(ShoppingCartPage.class).clicaProsseguirPgEnvio();
    }

    @Entao("confirmo os dados de pagamento e visualizo a mensagem {string}")
    public void confirmoOsDadosDePagamentoEVisualizoAMensagem(String msgSucessoCucumber) {
        Na(ShoppingCartPage.class).validaPgPagamento();
        Na(ShoppingCartPage.class).selecionaFormaPagamento();
        Na(ShoppingCartPage.class).validaFormaPagamentoBanco();
        Na(ShoppingCartPage.class).confirmaCompra(msgSucessoCucumber);
        //Na(ShoppingCartPage.class).voltaParaHome();
    }
}

