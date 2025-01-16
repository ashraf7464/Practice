package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.List;


public class HomeWork {

    public WebDriver driver;

    public void driverInit(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--guest");
        driver = new EdgeDriver();
        driver.manage().window().maximize();////

        //System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
        //driver = new EdgeDriver();
    }

    public void navigateToURL(){
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

    }

    public void maximizeBrowser(int width, int height){
        //JavascriptExecutor js = (JavascriptExecutor) driver;          //This method is not supported for all Browser
        //js.executeScript("window.resizeTo("+width+","+height+")");

        Dimension customWindowSize = new Dimension(width, height);
        driver.manage().window().setSize(customWindowSize);
    }

    public void getTableData(){

        HashMap<String, String> product = new HashMap<>();

        List<WebElement> nameElements = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[1]"));
        List<WebElement> positionElements = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[2]"));
        List<WebElement> cityElements = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[3]"));
        List<WebElement> amountElements = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"));

        for(int i=0; i<nameElements.size(); i++){
            String name = nameElements.get(i).getText();
            String position = positionElements.get(i).getText();
            String city = cityElements.get(i).getText();
            String amount = amountElements.get(i).getText();
            product.put(name, position+", "+city+", "+amount);
        }
        System.out.println(product);

        System.out.println("Alex: "+product.get("Alex"));


    }

    public void tearDown(){
        driver.quit();
    }


    public static void main(String[] args) {
        HomeWork obj = new HomeWork();
        obj.driverInit();
        obj.navigateToURL();
        obj.maximizeBrowser(1920,1080);
        obj.getTableData();
        obj.tearDown();
    }
}
