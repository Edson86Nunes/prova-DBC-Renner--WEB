package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    private WebElement campoUsuarioLogado;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
    private WebElement campoMinhaInfoPessoal;



}