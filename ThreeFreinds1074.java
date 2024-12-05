import java.util.*;
//import java.io.*;



public class ThreeFreinds1074 {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int X=sc.nextInt();
    int Y=sc.nextInt();
    int Z=sc.nextInt();
   
        if(X+Y==Z || Y+Z==X || Z+X==Y){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    
}


sc.close();


}
}