package Hobbymarket.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delete extends BasePage {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[3]/div/a/i")
    WebElement deleteProd;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div[2]/span")
    WebElement messageCart;


    public Delete(WebDriver driver) {
        super(driver);
    }
    public void deleteTheProduct(){
        deleteProd.click();
    }
    public boolean alertMessage(){
        return messageCart.getText().contains("Nu mai sunt produse in cosul tau");
    }
}
