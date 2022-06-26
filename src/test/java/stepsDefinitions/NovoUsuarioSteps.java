package stepsDefinitions;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AuthenticationPage;
import pageObjects.FormPage;
import java.util.List;
import static utils.Configs.*;


public class NovoUsuarioSteps {

    @Dado("que eu esteja na pagina de autenticacao do site")
    public void queEuEstejaNaPaginaDeAutenticacaoDoSite() {

        abrirSistema();
        Na(AuthenticationPage.class).validaPgAutenticacao();
    }

    @Quando("insiro um email valido")
    public void insiroUmEmailValido() {
        String email = gerarEmail();
        Na(AuthenticationPage.class).preencherEmailCreate(email);
    }

    @E("clico em Create an accont  sou direcionado para pagina de cadastro de usuario")
    public void clicoEmCreateAnAccontSouDirecionadoParaPaginaDeCadastroDeUsuario() {
        Na(AuthenticationPage.class).clicaCreateAnAccount();
        Na(AuthenticationPage.class).validaPgAutenticacao();
    }

    @E("preencho os dados obrigatórios")
    public void preenchoOsDadosObrigatorios(List<String> form) {
        Na(AuthenticationPage.class).validaPgNovaConta();
        int percorreLista = form.size() /2; //para começar a preencher pela segunda linha da tabela no NovoUsuario.feature  :)

        Na(FormPage.class).preenchePrimeiroNome(form.get(percorreLista));
        Na(FormPage.class).preencheSegundoNome(form.get(percorreLista+1));
        Na(FormPage.class).preencheSenha(form.get(percorreLista+2));
        Na(FormPage.class).preencheDia(form.get(percorreLista+3));
        Na(FormPage.class).preencheMes(form.get(percorreLista+4));
        Na(FormPage.class).preencheAno(form.get(percorreLista+5));
        //dados endereço
        Na(FormPage.class).preencheEndereco(form.get(percorreLista+6));
        Na(FormPage.class).preencheCidade(form.get(percorreLista+7));
        Na(FormPage.class).preencheEstado(form.get(percorreLista+8));
        Na(FormPage.class).preencheCEP(form.get(percorreLista+9));
        Na(FormPage.class).preenchePais(form.get(percorreLista+10));
        Na(FormPage.class).preencheCelular(form.get(percorreLista+11));

    }

    @Entao("sou direcionado para a pagina da minha conta")
    public void clicoEmRegisterESouDirecionadoParaAPaginaDaMinhaConta() {
        Na(FormPage.class).clicaBtnRegister();
        Na(AuthenticationPage.class).validaPgMinhaConta();
    }
}
