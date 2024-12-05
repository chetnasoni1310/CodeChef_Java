import java.util.*;
//import java.io.*;



public class CandyAndCities {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int[]arr=new int[2*n];
    boolean flag=true;
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int count=0;
    boolean v[]=new boolean[2*n];
    Arrays.fill(v,false);
    for(int i=0;i<arr.length;i++){
        
        if(v[i]==true){
            continue;
        }
        else{
            count=1;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                    v[j]=true;
                    count++;
                 }
            }
            if(count>=3){
                flag=false;
                break;
            }

        }
        
    }
    if(flag){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }  
}
sc.close();



}
}