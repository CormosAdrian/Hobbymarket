package Hobbymarket.com.Tests;

import Hobbymarket.com.Pages.Delete;
import Hobbymarket.com.Pages.WishList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteProductTest extends BaseTests {
    @Test
    public static void DeleteProduct() throws InterruptedException {
        driver = new ChromeDriver();

        NavigateToSearch2();
        Delete webForm = new Delete(driver);
        webForm.deleteTheProduct();
        Thread.sleep(2000);
        Assert.assertTrue(webForm.alertMessage());
    }
}