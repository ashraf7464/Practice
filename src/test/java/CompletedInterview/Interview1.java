package CompletedInterview;

import Utilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Interview1 {

    private WebDriver driver;

    public void appInitialization() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--guest");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }

    public void nameAndPrice() {
        HashMap<String, String> product = new HashMap<>();

        List<WebElement> item = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        for (int i = 0; i < item.size(); i++) {
            String itemName = item.get(i).getText();
            String itemPrice = price.get(i).getText();
            product.put(itemName, itemPrice);
        }
        System.out.println(product.toString());
    }

    public void tearDown() {

        driver.quit();
    }

    public static void main(String[] args) {
        Interview1 obj = new Interview1();

        obj.appInitialization();
        obj.login();
        obj.nameAndPrice();
        obj.tearDown();
    }


}
