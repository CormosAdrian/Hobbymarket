package Hobbymarket.com.Tests;

import Hobbymarket.com.Pages.WishList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest extends BaseTests{

    @Test
    public static void verifyWishList() throws InterruptedException{
        driver = new ChromeDriver();

        WishList webForm=new WishList(driver);
        NavigateToSearch();
        webForm.wishButton();
        Thread.sleep(500);
        Assert.assertTrue(webForm.wishAdd());
        Thread.sleep(2000);
        webForm.wishButton();
        Thread.sleep(500);
        Assert.assertTrue(webForm.wishDelete());
    }

}
