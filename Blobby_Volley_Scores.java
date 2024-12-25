import java.util.*;
//import java.io.*;



public class Blobby_Volley_Scores {


public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
        int n = scanner.nextInt();
        String s = scanner.next();
        // your code goes here
        int a=0;
        int b=0;
        int sf=1;  //currently server flaf as 1 for alice
        for(char ch:s.toCharArray())
        {
            if(ch=='A')
            {
               if(sf==1)
               {
                   a++;
               }
               else
               {
                   sf=1;
               }
            }
            else
            {
                if(sf==0)
                {
                    b++;
                }
                else
                {
                    sf=0;
                }
            }
            
        }
        System.out.println(a+" "+b);
    }



// sc.close();


}
}