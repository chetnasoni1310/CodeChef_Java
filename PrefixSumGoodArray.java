import java.util.*;
//import java.io.*;



public class PrefixSumGoodArray {


public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
     int[]arr=new int[n];
     int count=0;
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
         
     }
    int[]sum=new int[n];
     sum[0]=arr[0];
      for(int i=1;i<n;i++)
     {
        sum[i]=sum[i-1]+arr[i];
         
     }
     for (int i = 0; i < sum.length; i++) {
        System.out.println(sum[i]);
     }
     for(int i=0;i<n;i++)
     {
        if(sum[i]==k)
        {
            count++;
        }
        
     }
     System.out.println(count);



sc.close();


}
}