import java.util.*;
import java.lang.*;
import java.io.*;

public class Wrap_Gifts

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t-->0)
        {
              int h=sc.nextInt();
                int l=sc.nextInt();
                  int w=sc.nextInt();
     
                    int peri=2*(l*h+w*h+w*l);
                   int  count=1000/peri ;
                  
                   System.out.println(count);
        }
        
	}
}
