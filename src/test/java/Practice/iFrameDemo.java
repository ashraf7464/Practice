package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrameDemo extends BaseClass {

    @Test (priority = 0)
    public void goToURL(){

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void getIFrame() throws InterruptedException {
        WebElement iFrame = driver.findElement(By.id("courses-iframe"));

        driver.switchTo().frame(iFrame);
        WebElement loginButton = driver.findElement(By.xpath("//a[@class='theme-btn register-btn']"));
        String str =loginButton.getText();
        System.out.println(str);
        loginButton.click();
        Thread.sleep(5000);

        //Validation that control is inside iFrame

        //driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();

        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();

        Thread.sleep(5000);


    }


}
