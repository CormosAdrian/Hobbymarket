package Hobbymarket.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;


    public final static String CHROME_DRIVER_LOCATION = "chromedriver";

   public final static String BASE_URL="  https://hobbymarket.ro/";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

}
