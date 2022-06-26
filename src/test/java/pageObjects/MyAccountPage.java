package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    private WebElement campoUsuarioLogado;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
    private WebElement campoMinhaInfoPessoal;

    @FindBy(id = "search_query_top")
    private WebElement campoPesquisa;

    @FindBy(name = "submit_search")
    private WebElement btnPesquisa;

    //*[@title='Printed Chiffon Dress'][@class='product-name']
    @FindBy(xpath = "//*[@id='color_37']")
    private WebElement corVerde;

    @FindBy(id = "color_2")
    private WebElement corAzul;

    @FindBy(id = "color_7")
    private WebElement corPreto;


    @FindBy(id = "group_1")
    private WebElement selecionaTamanho;

    @FindBy(xpath = "//*[@id='add_to_cart']/button")
    private WebElement btnAdicionaCarrinho;

    @FindBy(xpath = "//*/div/div/div[3]/div/a")
    private WebElement abreCarrinho;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
    private WebElement produtoBlouse;

    @FindBy(id = "quantity_wanted")
    private WebElement quantidade;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    private WebElement btnContinueShopping;

    public void continuaCompras() {
        btnContinueShopping.click();
    }

    public void selecionaQuantidade(String qtd) {
        quantidade.clear();
        quantidade.sendKeys(qtd);
    }

    public void clicaEmBlouse() {
        produtoBlouse.click();
    }

    public void abreCarrinho() {
        abreCarrinho.click();
    }

    public void adicionaCarrinho() {
        btnAdicionaCarrinho.click();
    }

    public void selecionaTamanho(String tamanho) {
        selecionaTamanho.sendKeys(tamanho);
    }

    public void selecionaCorVerde() {
        corVerde.click();
    }

    public void selecionaCorAzul() {
        corAzul.click();
    }

    public void selecionaCorPreto() {
        corPreto.click();
    }

    public void preencheProduto(String produto) {
        campoPesquisa.sendKeys(produto);
    }

    public void pesquisaProduto() {
        btnPesquisa.click();
    }


}