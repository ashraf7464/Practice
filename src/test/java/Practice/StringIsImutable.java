package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringIsImutable {


    @Test(dependsOnMethods = {"test"} )
    public void stringIsImutable() {


        String a="hello"; //leteral way  //string pool memory
        String b="hello";
        String x="hello";
        String a1="hi";

        String c = new String("hello");
        String d = new String("hello");

        //System.out.println(x);

        if(a==c){
            System.out.println("hi");

        }

    }

    @Test
    public void test(){

        

    }
}
