import java.util.*;
//import java.io.*;



public class Start151GymDay {


    public static int numb(int d,int x,int y)
    {   
        
        if(y>=x)
        {
            return 0;
        }
        int count=0;
        while (x > y)
        {
            x = x - (int)(x * (d / 100));  // Reduce x by d percentage
            
            // To prevent x becoming non-positive, we check here
            // However, if the percentage is realistic, x should become <= y
            if (x <= 0)
            {
                return -1;  // This condition might be redundant; adjust based on problem statement
            }
            y--;
            count++;  // Increment the operation count
        }
        
        return count; 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         	Scanner sc =new Scanner(System.in);
            int t=sc.nextInt(); 
            while(t-->0)
            {
            int d=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println( numb(d,x,y));
            
            }
	}
}