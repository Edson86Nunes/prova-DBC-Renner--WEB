package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  {


    @FindBy(xpath = "/html/head/title")
    private WebElement tituloPagina;    //para verificar se esta na pagina correta

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private WebElement botaoSignIn;


}
