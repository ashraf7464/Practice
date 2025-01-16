package Practice;

import org.testng.annotations.Test;

public class StringBuilderBuffer {

    String name = "Md Ashraf Siddique";


    @Test
    public void append(){

        String name2 = "Md Ashraf Siddique";
        StringBuffer sb = new StringBuffer();
        sb.append(name2+" Siddique");
        sb.append(" Farzana");
        System.out.println(sb);


        String name3 = "Farzana";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name3+" Haritha");
        sb2.append(" Farzana");
        System.out.println(sb2);


    }

    @Test
    public void insert(){
        StringBuilder sb = new StringBuilder(name);
        sb.insert(10,"Md ABCD ");
        System.out.println(sb);
    }

    @Test
    public void replace(){
        //"Md Ashraf Siddique"
        StringBuilder sb = new StringBuilder(name);
        sb.replace(3,9,"Asif");
        System.out.println(sb);
    }

    @Test
    public void delete(){
        StringBuilder sb = new StringBuilder(name);
        sb.delete(3,9);
        System.out.println(sb);
    }

    @Test
    public void reverse(){
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }

    @Test
    public void reverseWords(){

        String str = "My Name Is Ashraf";

        String [] words = str.split(" ");

        StringBuilder reverseWords = new StringBuilder();
//        reverseWords.reverse();
//        System.out.println(reverseWords);

        for(int i=words.length-1; i>=0; i--){
            reverseWords=reverseWords.append(words[i]);
            if(i!=0){
                reverseWords.append(" ");
            }
        }
        System.out.println(reverseWords);
    }

    @Test
    public void reverseWordAndEachWord(){
        String str = "My Name Is Ashraf";

        String [] words = str.split(" ");

        StringBuilder reverseWords = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            reverseWords=reverseWords.append(words[i]);

            if(i!=0){
                reverseWords.append(" ");
            }

        }
        reverseWords.reverse();
        System.out.println(reverseWords);

    }

    @Test
    public void toStringMethod(){
        String [] words ={"Are", "you", "a", "player?"};

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<=words.length-1; i++){
            if(i!=0){
                sb.append(" ");
            } sb.append(words[i]);
        }
        System.out.println(sb);
    }
}
