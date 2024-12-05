import java.util.*;
//import java.io.*;



public class TCSExam {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int[]d=new int[3];
    int[]s=new int[3];
    int sumd=0;
    int sums=0;
    for(int i=0;i<3;i++){
        d[i]=sc.nextInt();
    }
    for(int i=0;i<3;i++){
        s[i]=sc.nextInt();
    }
    for(int i=0;i<3;i++){
        sumd=sumd+d[i];
        sums=sums+s[i];
    }
    if(sumd>sums){
        System.out.println("Dragon");
    }
    else if(sumd==sums){
        if(d[0]>s[0]){
            System.out.println("Dragon");
        }
        else if(d[0]==s[0]){
            if(d[1]>s[1]){
                System.out.println("Dragon");
            }
            else if(d[1]==s[1]){
                System.out.println("Tie");
            }
            else{
                System.out.println("Sloth");
            }
        }
        else{
            System.out.println("Sloth");
        }
    }
    else{
        System.out.println("Sloth");
    }
}


sc.close();


}
}