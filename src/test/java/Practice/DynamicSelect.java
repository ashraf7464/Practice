package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DynamicSelect extends BaseClass {


    @Test
    public void dynamicSelect() throws InterruptedException {


        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

      WebElement dropDown = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        dropDown.sendKeys("uni");

        Thread.sleep(3000);

         List<WebElement> elements = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

         for(WebElement element:elements){
             if(element.getText().contains("Islands")){
                 System.out.println(element.getText());
                 element.click();
                 break;
             }
         }
     /*
         for(int i=0; i<elements.size(); i++){
             if(elements.get(i).getText().contains("Kingdom")){
                 String element = elements.get(i).getText();
                 elements.get(i).click();
                 System.out.println(element);
             }
         }
*/
         Thread.sleep(3000);

    }

    @Test
    public void dynamicSelect2() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
        //searchBox.sendKeys("i");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        //wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        for(WebElement element: elements){
            if(element.getText().contains("iphone 15 pro max case")){
                System.out.println(element.getText());
                element.click();
            }
        }
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
    }

}
