package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pageObjects.AuthenticationPage;
import pageObjects.MyAccountPage;

import static utils.Configs.Na;
import static utils.Configs.abrirSistema;

public class UsuarioCompraSteps {
    @Dado("que eu esteja logado com o usuario {string} senha {string}")
    public void queEuEstejaLogadoComOUsuarioSenha(String email, String passwd) {
        abrirSistema();
        Na(AuthenticationPage.class).preencherLogin(email);
        Na(AuthenticationPage.class).preencherSenha(passwd);
        Na(AuthenticationPage.class).clicaBtnLogin();

        }

    @Quando("pesquiso o produto {string}")
    public void pesquisoOProduto(String produto) {
        Na(MyAccountPage.class).preencheProduto(produto);
        Na(MyAccountPage.class).pesquisaProduto();
    }

    @E("escolho a cor {string}")
    public void escolhoACor(String corVerde) {
        Na(MyAccountPage.class).selecionaCorVerde();
    }

    @E("escolho o tamanho {string}")
    public void escolhoOTamanho(String tamanho) {
        Na(MyAccountPage.class).selecionaTamanho(tamanho);
    }

    @E("adiciono o produto no carrinho")
    public void adicionoOProdutoNoCarrinho() {
        Na(MyAccountPage.class).adicionaCarrinho();
    }
}

