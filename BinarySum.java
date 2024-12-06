import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySum

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
 Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
             int k=sc.nextInt();
             int floor=n/2;
             int ceil=(n+1) / 2;
             if(k>=floor && k<=ceil)
             {
                 System.out.println("Yes");
             }
             else{
                  System.out.println("No");
             }
             
	}}
}
