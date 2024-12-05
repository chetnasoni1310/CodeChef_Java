import java.util.*;
//import java.io.*;



public class RatingOrder {


public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);
int t = scanner.nextInt();

while (t-- > 0) {
    int n = scanner.nextInt();
    int[] d = new int[n];
    boolean flag=false;
    for (int i = 0; i < n; i++) {
        d[i] = scanner.nextInt();
    }
    
    // Your code goes here
    for(int i = 0; i < d.length; i++) {
        if(d[i]>d[i+1]){
            flag=false;
            break;
        }
        else{
            flag=true;
        }
    }

     if(flag){
        System.out.println("Yes");

     }
     else{
        System.out.println("No");

     }




}


scanner.close();


}
}