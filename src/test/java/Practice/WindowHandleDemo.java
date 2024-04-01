package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleDemo extends BaseClass {

    String primaryWindow;
    String newWindow;
    @Test(priority = 1)
    public void goToURL(){

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        primaryWindow= driver.getWindowHandle();        //primaryWindowID =ABC123
        System.out.println("Primary window: "+primaryWindow);
    }

    @Test(priority = 2)
    public void openNewWindow(){
        WebElement newWindow = driver.findElement(By.id("openwindow"));
        newWindow.click();
    }
    @Test (priority = 3)
    public void getWindowHandles() throws InterruptedException {

        Set<String> windowHandles= driver.getWindowHandles();   //primaryWindowID =ABC123
                                                                //newWindowID=XYZ345

        System.out.println(windowHandles);

        for(String windowHandle: windowHandles) {
            if(!primaryWindow.equals(windowHandle)){
                driver.switchTo().window(windowHandle);
                newWindow=windowHandle;
            }
        }
        System.out.println(newWindow); // For checking
    }
    @Test(priority = 4)
    public void newWindow(){
        String email= driver.findElement(By.xpath("(//span[contains(text(),'info@qaclickacademy.com')])[2]")).getText();
        System.out.println(email);
        driver.close();
    }

    @Test(priority = 5)
    public void moveToPrimaryWindow() throws InterruptedException {

        driver.switchTo().window(primaryWindow);
        Thread.sleep(3000);
    }
}
