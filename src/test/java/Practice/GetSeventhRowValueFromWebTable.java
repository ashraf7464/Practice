package Practice;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetSeventhRowValueFromWebTable extends BaseClass {

    @Test
    public void getRowGetValue(){

        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[1]"));

        WebElement row7 = table.findElements(By.tagName("tr")).get(6);

        List<WebElement> cellValues = row7.findElements(By.tagName("td"));

        for(WebElement cellValue: cellValues){
            System.out.println(cellValue.getText());
        }
        //String cellValue1 = row7.findElements(By.tagName("td")).get(0).getText();
        //String cellValue2 = row7.findElements(By.tagName("td")).get(1).getText();

        //System.out.println(cellValue1+cellValue2);

    }

}
