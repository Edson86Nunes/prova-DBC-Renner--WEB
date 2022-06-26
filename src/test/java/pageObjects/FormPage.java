package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    @FindBy(id = "customer_firstname")
    private WebElement campoPrimeiroNome;

    @FindBy(id = "customer_lastname")
    private WebElement campoSegundoNome;

    @FindBy(id = "passwd")
    private WebElement campoSenha;

    @FindBy(id = "days")
    private WebElement campoDia;

    @FindBy(id = "months")
    private WebElement campoMeses;

    @FindBy(id = "years")
    private WebElement campoAno;

    public void clicaPrimeiroNome(){
        campoPrimeiroNome.click();
    }
    public void preenchePrimeiroNome(String customer_firstname ){
        campoPrimeiroNome.sendKeys(customer_firstname);
    }

    public void preencheSegundoNome(String customer_lastname ){
        campoSegundoNome.sendKeys(customer_lastname);
    }
    public void preencheSenha(String passwd ){
        campoSenha.sendKeys(passwd);
    }
    public void preencheDia(String days ){
        campoDia.sendKeys(days);
    }
    public void preencheMes(String months ){
        campoMeses.sendKeys(months);
    }
    public void preencheAno(String years ){
        campoAno.sendKeys(years);
    }

    //########################### Dados de endereço  ##############################
    @FindBy(id = "address1")
    private WebElement campoEndereco;

    @FindBy(id = "city")
    private WebElement campoCidade;

    @FindBy(id = "id_state")
    private WebElement campoEstado;

    @FindBy(id = "postcode")
    private WebElement campoCEP;

    @FindBy(id = "id_country")
    private WebElement campoPais;

    @FindBy(id = "phone_mobile")
    private WebElement telefoneCelular;

    @FindBy(id = "alias")
    private WebElement enderecoAlternativo;  //para usar tem q limpar o campo

    @FindBy(id = "submitAccount")
    private WebElement btnRegister;

    public void preencheEndereco(String city ){
        campoEndereco.sendKeys(city);
    }
    public void preencheCidade(String address1 ){
        campoCidade.sendKeys(address1);
    }
    public void preencheEstado(String id_state ){
        campoEstado.sendKeys(id_state);
    }
    public void preencheCEP(String postcode ){
        campoCEP.sendKeys(postcode);
    }
    public void preenchePais(String id_country ){
        campoPais.sendKeys(id_country);
    }
    public void preencheCelular(String phone_mobile ){
        telefoneCelular.sendKeys(phone_mobile);
    }

    public void clicaBtnRegister(){
        btnRegister.click();
    }








}
