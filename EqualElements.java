import java.util.*;
// import java.lang.*;
// import java.io.*;

class EqualElements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc =new Scanner(System.in);
            int t=sc.nextInt(); 
            while(t-->0)
            {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                Arrays.sort(arr);
                
                //Initial Error 
                // The value of max_Freq should store the maximum frequency of any element, 
                // including the case where there's only one occurrence of an element. However, 
                // you're not updating count correctly for the first appearance of a number.
                int count=1;
                System.out.println();
                int max_Freq=1;
                for(int i=1;i<n;i++)
                {
                    if(arr[i]==arr[i-1])
                    {
                      count++;
                    }
                    max_Freq=Math.max(count,max_Freq);
                    System.out.println("for "+arr[i]+" count and freqMax are "+count+" "+max_Freq);
                    count=1;
                }
                System.out.println(n-max_Freq);
            }


	}
}
