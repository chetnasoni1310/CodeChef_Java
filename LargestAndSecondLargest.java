import java.util.*;
//import java.io.*;



public class LargestAndSecondLargest {


public static void main(String[] args) {


Scanner scanner =new Scanner(System.in);
int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Your code goes here
            // System.out.println(Arrays.toString(arr));
            if(n>2)
     {
            for(int i = 0; i < n-1; i++) {
                for(int j = 0; j <n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                }
            }
            }
            // System.out.print(Arrays.toString(arr));
             
            for(int i = 0; i < n-2; i++)
             {
                if(arr[n-i-1]==arr[n-2-i])
                {
                 continue;
                }
                else{
                sum=arr[n-i-1]+arr[n-2-i];
                break;
                }
              }
              System.out.println(sum);
     }
           
            else {
                for(int i=0;i<n;i++){
                    sum=sum+arr[i];
                }
              System.out.println(sum);

            }
        }
        


scanner.close();


}
}