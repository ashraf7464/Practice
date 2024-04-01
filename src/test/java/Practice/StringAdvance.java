package Practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringAdvance {

    @Test
    public void reverseStringWithCollections(){

        String str = "HelloWorld";

        List<Character> charList = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            charList.add(str.charAt(i));
        }

        System.out.println(charList);

        Collections.reverse(charList);

        System.out.println(charList);

        StringBuilder reverseString = new StringBuilder();
        for(int j=0; j<charList.size(); j++){
            reverseString.append(charList.get(j));
        }

        System.out.println(reverseString.toString());
    }
}
