import java.util.*;
// import java.io.*;



public class DiscountYorN {


public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
   
    while (t-- > 0) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = new int[n];
        int sum=0;
        int sum1=0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // Your code goes here
         for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
         for (int i = 0; i < n; i++) {
             if(a[i]>y)
             {
                  a[i]=a[i]-y;
             }
             else{
                 a[i]=0;
             }
           
        }
         for (int i = 0; i < n; i++) {
            sum1+=a[i];
        }
        sum1=sum1+x;
        if(sum<=sum1){
            System.out.println("NO COUPON");
        }
        else{
           System.out.println("COUPON");
        }
        
        
        
    }
    


scanner.close();

}
}
