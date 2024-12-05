import java.util.*;
//import java.io.*;



public class PracMakePerfect {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int []arr=new int[4];
int count=0;
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
    if(arr[i]>=10){
        count++;

    }
    
}
System.out.println(count);
sc.close();


}
}