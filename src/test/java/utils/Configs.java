package utils;

import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public class Configs {
    public static WebDriver driver;


    public static void  abrirSistema() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //aguarda até 10s os elementos carregarem na página
        //driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }
    public static  <T> T Na(Class<T> classe){
        return PageFactory.initElements(driver, classe);
    }

    public static String gerarEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

}
