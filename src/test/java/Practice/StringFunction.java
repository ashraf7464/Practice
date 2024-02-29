package Practice;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StringFunction {


    String name = "Md Ashraf Siddique";
    String email = "connect.ashraf@gmail.com";
    String money = "100";
    int money1 = 100;


    @Test
    public void upperCaseLowerCase(){
        String upperCase= name.toUpperCase();
        String lowerCase= name.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);

        System.out.println(name.length());
    }

    @Test
    public void charOccurrences() {
        String name = "Md Ashraf Siddique";
        String name1 = name.replace(" ", "").toLowerCase();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : name1.toCharArray()) {

            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                int count = 0;
                for (char ch : name1.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                System.out.println("Character " + c + " appears " + count + " times.");
            }
        }

    }


    @Test
    public void splitString(){
        String[] words = name.split(" ");
        System.out.println(Arrays.toString(words));

        String [] words1 = name.split(" ",2);
        System.out.println(Arrays.toString(words1));
    }

    @Test
    public void StringToInteger(){
        int a = Integer.parseInt(money);
        System.out.println(a+100);
    }

    @Test
    public void purseInteger(){
        String str = "MD87ASH56RAF123";
        String intValue = str.replaceAll("[^0-9]","");
        int result = Integer.parseInt(intValue);
        System.out.println(result);
    }

    @Test
    public void purseString(){
        String str = "MD87ASH56RAF123";
        String strValue = str.replaceAll("[^a-zA-z]","");
        String result = String.valueOf(strValue);
        System.out.println(result);
    }

    @Test
    public void integerToString(){
        String str = String.valueOf(money1);

        System.out.println(str+100);
    }

    @Test
    public void reverseStringWithLoop(){

        String reverse ="";
        for(int i=name.length()-1; i>=0; i--){
            reverse = reverse+name.charAt(i);
        }
        System.out.println(reverse);

        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }

    @Test
    public void subString(){
        String subName = name.substring(3,9);
        System.out.println(subName);
    }

    @Test
    public void replace(){
        String newEmail = email.replace("@","#");
        System.out.println(newEmail);

        String newEmail1 = email.replace("ashraf","asif");
        System.out.println(newEmail1);

        if(email.startsWith("c")){
            System.out.println("ok");
        }
    }

    @Test
    public void palindrome(){
        String palindrome = "Kayak";
        String str ="";

        for(int i=palindrome.length()-1; i>=0; i--){
            str=str+palindrome.charAt(i);
        }

        if(str.equalsIgnoreCase(palindrome)){
            System.out.println(palindrome+ " is a Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }

    @Test
    public void pyramid(){
        for(int i=0; i<=10; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    @Test
    public void reversePyramid(){
        for(int i=10; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    @Test
    public void fibonacci(){
        int n1=0;
        int n2=1;
        int sum;
        for(int i=0; i<=10; i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.println(sum);
        }

    }

    @Test
    public void stringHasVowels(){
        String country = "Bangladesh";
        String str = country.toUpperCase();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println(c+" is a vowels");
            }
            else{
                System.out.println(c+" is not a vowels");
            }
        }
    }

}
