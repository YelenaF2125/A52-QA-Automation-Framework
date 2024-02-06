import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork18 extends BaseTest{
    @Test (description = "Play Sons from the List")
    public void playSongTest() throws InterruptedException {
        login("yelena.filenkova@testpro.io", "Te$tPro$tudent24");
        WebElement favoritePlayListLink = driver.findElement(By.xpath("//li[contains(@class, 'favorites')]/a"));
        favoritePlayListLink.click();
        Thread.sleep(3000);
        WebElement song = driver.findElement(By.xpath("//section[@id='favoritesWrapper']//td[text()='Pluto']"));
        song.click();
        song.sendKeys(Keys.ENTER);
        WebElement soundBar = driver.findElement(By.cssSelector("[data-test='sound-bar-play']"));
        Assert.assertTrue(soundBar.isDisplayed());
    }


}
