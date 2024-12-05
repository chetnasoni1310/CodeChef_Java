import java.util.*;
//import java.io.*;



public class Alice_Bob_Coin_Flipcart {
     

    public static int Min_Coins(int []arr,int n,int target)
    {   
        int count=0;
        int sum=0;
             for(int i=n-1;i>=0;i--)
		    {
		        if(arr[i]==target)
		        {
		            return ++count;
		        }
		       else if(arr[i]>target)
		        {
		           continue;
		        }
		        else
		        {   
		            while(sum<target && i>=0)
		            {
		            sum+=arr[i];
		            count++;
		            i--;
		            }
		            return count;
		        }
		    }
		    return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int target=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		   System.out.println(Min_Coins(arr,n,target));
	    }

        sc.close();
	}


}