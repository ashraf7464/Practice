package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringIsImutable {


    @Test(dependsOnMethods = {"test"} )
    public void stringIsImutable() {


        String a="hello"; //literal way  //string pool memory


        String b="hello";

        a.concat("World");

        System.out.println(a);
        String x="hello";
        String a1="hi";

        String c = new String("hello"); // normal
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
