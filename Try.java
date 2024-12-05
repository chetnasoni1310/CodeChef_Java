import java.util.*;
//import java.io.*;



public class Try {


public static void main(String[] args) {


Scanner scanner =new Scanner(System.in);
int n = scanner.nextInt();
int[] arr = new int[n];
// int sum=0;
for (int i = 0; i < n; i++) {
    arr[i] = scanner.nextInt();
}

// Your code goes here
System.out.println(Arrays.toString(arr));
 

scanner.close();


}
}