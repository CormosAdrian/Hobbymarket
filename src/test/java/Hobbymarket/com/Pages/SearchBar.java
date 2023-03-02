package Hobbymarket.com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends BasePage {
    public final static String LOGIN_URL = BASE_URL;
    @FindBy(id = "suggestion-search-box")
           // @FindBy(xpath = "//*[@id=\"suggestion-search-box\"]")
    WebElement serch;
    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div/ul/li/div/div[2]/div[3]/form/button")
    WebElement select;
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/a")
    WebElement finalCom;

    @FindBy(xpath = "//*[@id=\"desktop_cart\"]/div/div/a/span[2]/span[1]")
    WebElement verify;


    public SearchBar(WebDriver driver) {
        super(driver);
    }
    public void serchProduct(){
        serch.sendKeys("Rezistenta Siliconica Pat Incalzit 300x300mm 220V 300W");
        serch.sendKeys(Keys.ENTER);
    }
    public void selectProduct(){
        select.click();
    }
    public void finalComanda(){
        finalCom.click();
    }

    public boolean verifyProduct(){
        return verify.getText().contains("Items (1)");
    }



}