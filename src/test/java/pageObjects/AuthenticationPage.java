package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

    @FindBy(xpath = "//*[@id='create-account_form']/h3")  //para validar se esta na pagina de criação
    private WebElement createAnAccount;


    @FindBy(id = "email_create")
    private WebElement campoEmailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement botaoCreateAnAccount;

    public void preencherEmailCreate(String emailCreate){
        campoEmailCreate.sendKeys(emailCreate);
    }

    public void clicaCreateAnAccount(){ botaoCreateAnAccount.click();
    }

}
