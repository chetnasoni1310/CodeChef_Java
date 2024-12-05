import java.util.*;
//import java.io.*;



public class Buy1_Get1_1191 {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
while(t-->0){
    String s=sc.nextLine();
    char temp= s.charAt(0);
    int count=0;
    for(int i=1;i<s.length()-1;i++){
          if(s.charAt(i)==temp){
            count++;
          }
          temp= s.charAt(i+1);
          i++;
    }
}


sc.close();


}
}