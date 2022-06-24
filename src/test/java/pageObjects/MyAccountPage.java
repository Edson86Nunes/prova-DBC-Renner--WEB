package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    private WebElement campoUsuarioLogado;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
    private WebElement campoMinhaInfoPessoal;

    @FindBy(id = "search_query_top")
    private WebElement campoPesquisa;

    @FindBy(name = "submit_search")
    private WebElement btnPesquisa;

    //*[@title='Printed Chiffon Dress'][@class='product-name']
    @FindBy(id = "color_37")
    private WebElement corVerde;

    @FindBy(id = "group_1")
    private WebElement selecionaTamanho;

    @FindBy(name = "submit")
    private WebElement btnAdicionaCarrinho;

    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[1]/h2/text()")
    private WebElement msgAddCarrinho;

    public void adicionaCarrinho() {
        btnAdicionaCarrinho.click();
    }

    public void selecionaTamanho(String tamanho) {
        selecionaTamanho.sendKeys(tamanho);
    }

    public void selecionaCorVerde() {
        corVerde.click();
    }

    public void preencheProduto(String produto) {
        campoPesquisa.sendKeys(produto);
    }

    public void pesquisaProduto() {
        btnPesquisa.click();
    }



}