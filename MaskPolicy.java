import java.util.*;
//import java.io.*;



public class MaskPolicy {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int infected=sc.nextInt();
    int uninfected=n-infected;
    System.out.println(Math.min(infected, uninfected));
}


sc.close();


}
}