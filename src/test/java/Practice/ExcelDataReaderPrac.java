package Practice;

import DataReader.ExcelDataReader;
import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExcelDataReaderPrac extends BaseClass {


    @Test(dataProvider = "Login Data from Excel", dataProviderClass = ExcelDataReader.class)
    public void excelDataReaderTest(String userName, String password){

        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();



    }
    /*

     */
}
