package Practice;

import Utilities.BaseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenshotDemo extends BaseClass {

    @Test
    public void takeScreenshot() throws IOException, InterruptedException {
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        screenshot("Amazon");
        screenshot("xyz");

    }


}
