import java.util.*;
//import java.io.*;



public class DiffToPronounce  {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();

while(t-->0){
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        boolean flag=true;
        for(int i=0; i<n; i++){

            if(s.charAt(i)=='a' ||  s.charAt(i)=='e' ||  s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
              count=0;
              flag=true;
            }
            else{
                count++;
                if(count==4){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
           System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
}
sc.close();


}
}