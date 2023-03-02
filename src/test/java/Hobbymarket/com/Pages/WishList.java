package Hobbymarket.com.Pages;

import Hobbymarket.com.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishList extends BasePage {
    //@FindBy(xpath = "//*[@id=\"js-product-list\"]/div/ul/li/div/div[1]/a[2]/span")
    @FindBy(css = "#js-product-list > div > ul > li > div > div.thumbnail-container > a.add_to_wishlist.wishlist-product-miniature > span")
    WebElement wish;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]")
    WebElement add;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]")
    WebElement delete;




    public WishList(WebDriver driver) {
        super(driver);
    }
    public void wishButton(){
        wish.click();
    }
    public boolean wishAdd(){
        return add.isDisplayed();
    }
    public boolean wishDelete(){
        return delete.isDisplayed();
    }
}
