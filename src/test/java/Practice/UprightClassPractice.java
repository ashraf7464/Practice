package Practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UprightClassPractice {


    //Ø Take 5 numbers like 100,200,300,400,500 and use it in an array format and print out all the numbers using loop.
    @Test
    public void arrayDemo(){
        int [] numbers = {100,200,300,400,500};

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    //Ø Take 5 numbers like 100,200,300,400,500 and use it in an arrayList format and print out all the numbers using loop.
    @Test
    public void arrayListDemo(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100,200,300,400,500));

        for(Integer n: numbers){
            System.out.println(n);
        }

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }

    //Ø Take 5 numbers like 100,200,300,400,500 and write a program to find the highest value from those number?
    //Use Array and ArrayList format
    @Test
    public void maxNumber(){
        int [] numbers = {800,100,200,300,900,400,500};

        int max = 0;
        for(int i=0; i<numbers.length; i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        } System.out.println(max);

        int min =numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if (min>numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);


        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(800,100,200,300,400,500));

        int max1 = Collections.max(numbers1);
        System.out.println(max1);

        int min1 = Collections.min(numbers1);
        System.out.println(min1);

    }

    @Test
    public void secondMaxNumber(){
        int [] numbers = {800,100,200,300,900,400,500};

        Arrays.sort(numbers);
        int secondMax = numbers[numbers.length-2];
        System.out.println(secondMax);
    }



}