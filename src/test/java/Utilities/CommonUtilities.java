package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

public class CommonUtilities {

    public WebDriver driver;

    public void screenshot(String fileName) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\conne\\IdeaProjects\\Practice\\src\\test\\ScreenShots"+fileName+timeStamp+".png"));
    }


    public void elementToBeClickable(WebDriver driver, int waitTime, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


//    @AfterMethod
//    public void takeScreenshotOnFailure(ITestResult result){
//        if(result.getStatus()==ITestResult.FAILURE){
//            try{
//                screenshot(result.getName()+"Failed");
//            }
//            catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//
//    }

    public void scrollHeight() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

    }

    public void scrollByNumber(int horizontalScroll, int verticalScroll) throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+horizontalScroll+","+verticalScroll+")");


    }

    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    /*
    "window.scrollBy(0,document.body.scrollHeight)"
    "window.scrollBy(0,1000)"
    "arguments[0].scrollIntoView();", element
     */
}
