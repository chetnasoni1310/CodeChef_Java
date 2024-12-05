import java.util.*;
// import java.io.*;



public class RunningComparison {


public static void main(String[] args) {


Scanner scanner =new Scanner(System.in);
int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            // int hb=0;
            // int ha=0;
            int count=0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
        //      for(int i = 0; i < n; i++) {
        //         if(a[i]>2*b[i]){
        //             System.out.println("Alice happy");
        //             System.out.println("Bob unhappy");
        //             ha++;
                    
        //         }
        //         else if(b[i]>2*a[i]){
        //             System.out.println("Bob happy");
        //             System.out.println("Alice unhappy");
        //             hb++;
        //         }
        //         else if(a[i]<2*b[i] && b[i]<2*a[i]){
        //             System.out.println("Bob happy");
        //             System.out.println("Alice happy");
        //             count++;
        //           }
        //        else{
        //         System.out.println("Bob happy");
        //             System.out.println("Alice happy");
        //        }

        // }

        for(int i = 0; i < n; i++) {
            if((a[i]<=2*b[i] )&&( b[i]<=2*a[i])){
                            // System.out.println("Bob happy");
                            // System.out.println("Alice happy");
                            count++;
                          }
        }
        
                   System.out.println(count);

    }

scanner.close();

    


}

}
