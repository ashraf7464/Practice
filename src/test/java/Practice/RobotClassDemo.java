package Practice;

import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClassDemo {

    private static void typeString(Robot robot, String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(500);

        }
    }

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        // Open Notepad
        String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);

        // Wait for Notepad to open
        Thread.sleep(2000);

        // Create a Robot instance
        Robot robot = new Robot();

        // Type each character with a delay of 500 ms
        typeString(robot, "hello from geeksforgeeks");
    }
}
