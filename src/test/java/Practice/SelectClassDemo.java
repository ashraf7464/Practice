package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassDemo extends BaseClass {

    @Test
    public void selectDemo() throws InterruptedException {

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        //driver.findElement(By.xpath("dropdown-class-example")).click();

        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByValue("option1");
        Thread.sleep(5000);


        List<WebElement> options = select.getOptions();

        for(int i=0; i<options.size(); i++ ){
            //System.out.println(options.get(i).getText());
            if(options.get(i).getText().equalsIgnoreCase("Option3")){
                options.get(i).click();
                Thread.sleep(5000); 

            }
        }


    }
}
