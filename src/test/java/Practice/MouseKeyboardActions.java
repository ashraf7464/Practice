package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseKeyboardActions extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


        WebElement mouseHoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
        scrollIntoView(mouseHoverButton);
        //Actions action = new Actions(driver);

        Thread.sleep(3000);
        new Actions(driver).moveToElement(mouseHoverButton).perform();


        Thread.sleep(3000);

        WebElement dropDownBox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        //scrollIntoView(dropDownBox);
        new Actions(driver).moveToElement(dropDownBox).click().build().perform();
        Thread.sleep(3000);

    }

    @Test()
    public void pressKeys() throws InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Actions ac = new Actions(driver);
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
    }

}
