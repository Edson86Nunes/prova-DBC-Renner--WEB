package pageObjects;

import static utils.Configs.*;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

    @FindBy(className = "step_current  first")
    private WebElement resumoCarrinho;

    @FindBy(xpath = "//*[@id='product_7_38_0_712824']/td[2]/p/a")
    private WebElement nomeProduto1;

    @FindBy(xpath = "//*[@id='product_1_2_0_712824']/td[2]/p/a")
    private WebElement nomeProduto2;

    @FindBy(xpath = "//*[@id='product_2_7_0_712824']/td[2]/p/a")
    private WebElement nomeProduto3;

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
