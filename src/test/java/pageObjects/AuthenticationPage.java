package pageObjects;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

    @FindBy(xpath = "//*[@id='create-account_form']/h3")  //para validar se esta na pagina de criação
    private WebElement createAnAccount;

    @FindBy(xpath = "//*[@id='account-creation_form']/div[1]/h3")
    private WebElement pgNovaConta;

    @FindBy(id = "email_create")
    private WebElement campoEmailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement botaoCreateAnAccount;

    @FindBy(id = "email")
    private WebElement emailLogin;

    @FindBy(id = "passwd")
    private WebElement senhaLogin;

    @FindBy(id = "SubmitLogin")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id='center_column']/p")
    private WebElement minhaConta;


    public void validaPgNovaConta()  {
        String pgContanova;
        pgContanova = pgNovaConta.getText();
        Assert.assertThat(pgContanova, StringContains.containsString("YOUR PERSONAL INFORMATION"));
    }

    public void validaPgMinhaConta() {
        String pgMinhaConta;
        pgMinhaConta = minhaConta.getText();
        Assert.assertThat(pgMinhaConta, StringContains.containsString("Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    public void clicaBtnLogin() {
        btnLogin.click();
    }

    public void preencherLogin(String email) {
        emailLogin.sendKeys(email);
    }

    public void preencherSenha(String passwd) {
        senhaLogin.sendKeys(passwd);
    }

    public void preencherEmailCreate(String emailCreate) {
        campoEmailCreate.sendKeys(emailCreate);
    }

    public void clicaCreateAnAccount() throws InterruptedException {
        botaoCreateAnAccount.click();
        Thread.sleep(2000);
    }
}


