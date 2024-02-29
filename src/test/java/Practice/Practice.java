package Practice;

import Utilities.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Practice extends BaseClass {

@Test
    public void screenshot(String fileName) throws IOException {
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("pathName"+fileName));

    }
@Test
    public void takeScreenshotOnFailure(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE){
            try{
                screenshot(result.getName()+"Failed");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void maxNumber(){

        int [] numbers = {800,100,400,200,900,300};
        int maxNumber =0;

        for(int i=0; i<numbers.length; i++){
            if(maxNumber<numbers[i]){
                maxNumber=numbers[i];
            }
        }
        System.out.println(maxNumber);


        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(800,100,400,200,900,300));

        int maxNumber1 = Collections.max(numbers1);
        System.out.println(maxNumber);
    }

    @org.junit.Test
    public void evenAndOddNumber(){
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0; i<number.length; i++){
            if(number[i]%2==0){
                System.out.println("even number "+number[i]);
            } else{
                System.out.println("odd number "+number[i]);
            }
        }

    }
    @org.junit.Test
    public void sumAndAvg() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 12};

        int sum=0;
        for(int i=0; i<number.length; i++){
            sum= sum+number[i];
        }
        System.out.println(sum);

        double avg = (double) sum/number.length;
        System.out.println(avg);

    }

    @org.junit.Test
    public void removeDuplicate() {
        Integer [] number = {1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9, 13, 12};

        List<Integer> list = Arrays.asList(number);
        Set<Integer> numbers = new HashSet<>(list);

        System.out.println(numbers);


        int [] number1 = {1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9, 13, 12};
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<number1.length; i++){
            list1.add(number1[i]);
        }
        System.out.println(list1);
        Set<Integer> numbers1 = new HashSet<>(list1);
        System.out.println(numbers1);


    }

    @Test
    public void validateArrayListHasData() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 13, 12, 6));

        int value = 6;

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            if(iterator.next()==value){
                System.out.println("True");
                break;
            }
        }


    }

}
