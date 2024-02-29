package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ScreenshotAndScroll extends BaseClass {

    @Test
    public void tryCaptureScreenshot() throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        WebElement updateLocation = driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
        elementToBeClickable(driver,10,updateLocation);
        updateLocation.click();


        String str= driver.findElement(By.xpath("//h4[@id='a-popover-header-1']")).getText();
        System.out.println(str);

        WebElement shipOutsideUS = driver.findElement(By.xpath("//span[@id='GLUXCountryValue']"));
        elementToBeClickable(driver,5,shipOutsideUS);
        shipOutsideUS.click();


        //Failed Part

        WebElement selectCountry =driver.findElement(By.xpath("//a[@id='GLUXCountryList_7']"));
        elementToBeClickable(driver,5,selectCountry);
        selectCountry.click();



    }
    @Test

    public void scrollHeightPrac() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        scrollHeight();
        String str1 = driver.findElement(By.xpath("//a[@href='/privacyprefs?ref_=footer_iba']")).getText();
        System.out.println(str1);
        Thread.sleep(5000);

    }

    @Test
    public void scrollByNumberPrac() throws InterruptedException, IOException {
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        //driver.manage().window().maximize();

        scrollByNumber(0,1000);
        Thread.sleep(5000);

    }

    @Test
    public void scrollIntoViewPrac() throws InterruptedException, IOException {
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        scrollIntoView(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")));
        Thread.sleep(5000);

    }




}