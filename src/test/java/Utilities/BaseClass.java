package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass extends CommonUtilities{

    @BeforeClass
    public void driverInitialization(){

        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        driver = new EdgeDriver(options);


        /*System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        driver = new EdgeDriver(options);*/

    }

    @AfterClass
    public void tearDown(){

        driver.close();
        // New Lines Added by Duke


    }
}
