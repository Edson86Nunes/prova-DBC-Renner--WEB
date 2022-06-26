package pageObjects;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

    @FindBy(className = "step_current  first")
    private WebElement resumoCarrinho;

    @FindBy(id = "cart_title")
    private WebElement pgResumoCarrinho;

    @FindBy(className = "page-heading")
    private WebElement pgEndereco;

    @FindBy(xpath = "//*[@id='product_7_38_0_712824']/td[2]/p/a")
    private WebElement nomeProduto1;

    @FindBy(xpath = "//*[@id='product_1_2_0_712824']/td[2]/p/a")
    private WebElement nomeProduto2;

    @FindBy(xpath = "//*[@id='product_2_7_0_712824']/td[2]/p/a")
    private WebElement nomeProduto3;

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
    private WebElement btnProsseguirPgResumo;

    @FindBy(id = "addressesAreEquals")
    private WebElement checkboxEndereco;

    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    private WebElement btnProsseguirPgEndereco;

    @FindBy(id = "carrier_area")
    private WebElement validaPgEnvio;

    @FindBy(id = "cgv")
    private WebElement checkboxTermosEnvio;

    @FindBy(xpath = "//*[@id='form']/p/button")
    private WebElement btnProsseguirPgEnvio;

    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement validaPgPagamento;

    @FindBy(className = "bankwire")
    private WebElement selecionaPagBanco;

    @FindBy(xpath = "//*[@id='center_column']/form/div/h3")
    private WebElement validaFormaPagamentobanco;

    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement resumoPedido;

    @FindBy(xpath ="//*[@id='cart_navigation']/button")
    private WebElement btnConfirmarCompra;

    @FindBy(xpath ="//*[@id='center_column']/div/p/strong")
    private WebElement msgSucessoCompra;

    @FindBy(className ="icon-home")
    private WebElement iconeHome;

    public void voltaParaHome() {
        iconeHome.click();
    }

    public void confirmaCompra(String msgSucessoCucumber) {
        btnConfirmarCompra.click();
        String msgSucessoWeb;
        msgSucessoWeb = msgSucessoCompra.getText();
        Assert.assertThat(msgSucessoWeb, StringContains.containsString(msgSucessoCucumber));
    }

    public void selecionaFormaPagamento() {
        selecionaPagBanco.click();
    }

    public void selecionaTermosEnvio() {
        checkboxTermosEnvio.click();
    }

    public void validaFormaPagamentoBanco(){
        String pgPagBanco;
        pgPagBanco = validaFormaPagamentobanco.getText();
        Assert.assertThat(pgPagBanco, StringContains.containsString("BANK-WIRE PAYMENT."));
    }

    public void validaPgPagamento(){
        String pgPag;
        pgPag = validaPgPagamento.getText();
        Assert.assertThat(pgPag, StringContains.containsString("PLEASE CHOOSE YOUR PAYMENT METHOD"));
    }

    public void validaPgEnvioCarrinho(){
        String pgEnvio;
        pgEnvio = validaPgEnvio.getText();
        Assert.assertThat(pgEnvio, StringContains.containsString("SHIPPING"));
    }

    public void clicaProsseguirPgResumo() {
        btnProsseguirPgResumo.click();
    }

    public void clicaProsseguirPgEndereco() {
        btnProsseguirPgEndereco.click();
    }

    public void clicaProsseguirPgEnvio() {
        btnProsseguirPgEnvio.click();
    }

    public void validaPgResumoCarrinho(){
        String pgResumo;
        pgResumo = pgResumoCarrinho.getText();
        Assert.assertThat(pgResumo, StringContains.containsString("SHOPPING-CART SUMMARY"));
    }

    public void validaPgEndereco(){
        String pgEnd;
        pgEnd = pgEndereco.getText();
        Assert.assertThat(pgEnd, StringContains.containsString("ADDRESSES"));
    }

    public void validarProdutos(){
        String produto1, produto2,produto3;
        produto1 = nomeProduto1.getText();
        Assert.assertThat(produto1, StringContains.containsString("Printed Chiffon Dress"));
        produto2 = nomeProduto2.getText();
        Assert.assertThat(produto2, StringContains.containsString("Faded Short Sleeve T-shirts"));
        produto3 = nomeProduto3.getText();
        Assert.assertThat(produto3, StringContains.containsString("Blouse"));
    }


}
