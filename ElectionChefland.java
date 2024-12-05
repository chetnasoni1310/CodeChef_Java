import java.util.*;
//import java.io.*;



public class ElectionChefland {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int[]arr=new int[3];
for(int i=0;i<3;i++){
    arr[i]=sc.nextInt();
}
int max=50;
int ans=Integer.MIN_VALUE;
for(int i=0;i<3;i++){
    
        if(arr[i]>max)
        {
        max=arr[i];
        ans=i;
        }
        
}
if(ans==0){
    System.out.println("A");
}
else if(ans==1){
    System.out.println("B");
}
else if(ans==2){
    System.out.println("C");
}
else {
    System.out.println("NOTA");
}     
}

sc.close();


}
}