import java.util.*;
//import java.io.*;



public class Happy_Vowel_String {
    public static String checkInput(String s)
    {
        // int n=s.length();
        int count=0;
       for(char ch:s.toCharArray())
       {
           if(isVowel(ch))
           {    
               count++;
               if(count>2)
              { 
                  return "HAPPY";
              }
           }
           else
           {
               count=0;
           }
       }
       return "SAD";
    }
    public static boolean isVowel(char ch)
    {
        return ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ;
    }

public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
        String s = scanner.next();

        // Your code goes here
        String ans=checkInput(s);
        System.out.println(ans);
    }

}
}