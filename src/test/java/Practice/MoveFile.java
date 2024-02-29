package Practice;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class MoveFile {

    @Test
    public void moveFile() throws IOException, InterruptedException {

        File f1 = new File("C:\\Users\\conne\\Downloads\\xyz.txt");
        File f2 = new File("D:\\MoveToThisFolder\\xyz.txt");

        FileUtils.moveFile(f1,f2);
        //f1.delete();
        Thread.sleep(5000);

        FileUtils.moveFile(f2,f1);



    }

}
