package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iFrameDemo extends BaseClass {

    @Test (priority = 0)
    public void goToURL(){

        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

    }

    @Test (priority = 1)
    public void getIFrame() throws InterruptedException {
        WebElement iFrame = driver.findElement(By.id("courses-iframe"));

        //new Actions(driver).moveToElement(iFrame);
        scrollIntoView(iFrame);
        driver.switchTo().frame(iFrame);
        Thread.sleep(3000);

        WebElement learningPathButton = driver.findElement(By.xpath("(//a[@href='learning-path'])[1]"));
        learningPathButton.click();

        Thread.sleep(5000);

        //Validation that control is inside iFrame


        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();

        Thread.sleep(5000);


    }


}
