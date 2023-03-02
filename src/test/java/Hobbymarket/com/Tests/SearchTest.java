package Hobbymarket.com.Tests;

import Hobbymarket.com.Pages.SearchBar;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Hobbymarket.com.Pages.SearchBar.LOGIN_URL;


public class SearchTest extends BaseTests{


    @Test
    public static void SerchProductInBar() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        SearchBar webForm=new SearchBar(driver);
        webForm.serchProduct();
        webForm.selectProduct();
        Thread.sleep(6000);
        webForm.finalComanda();
        Thread.sleep(1000);
        Assert.assertTrue(webForm.verifyProduct());
    }
}
