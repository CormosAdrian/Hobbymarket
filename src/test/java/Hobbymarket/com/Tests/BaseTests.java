package Hobbymarket.com.Tests;

import Hobbymarket.com.Pages.BasePage;
import Hobbymarket.com.Pages.SearchBar;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTests {
    protected static WebDriver driver;
    @BeforeMethod
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }
    public static void NavigateToSearch () throws InterruptedException {
        driver.get(BasePage.BASE_URL);
        SearchBar webForm=new SearchBar(driver);
        webForm.serchProduct();
        Thread.sleep(500);
    }
    public static void NavigateToSearch2() throws InterruptedException{
        NavigateToSearch();
        SearchBar webForm=new SearchBar(driver);
        webForm.selectProduct();
        Thread.sleep(2000);
        webForm.finalComanda();
        Thread.sleep(2000);

    }




    @AfterMethod
    protected void tearDown(){
        driver.manage().deleteAllCookies();
       // driver.close();
    }
}
