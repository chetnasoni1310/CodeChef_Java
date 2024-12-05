import java.util.*;
//import java.io.*;



public class DietChef {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int k=sc.nextInt();
    int stock=0;
    boolean flag=true;
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]>k){
            stock=arr[i]-k;
        }
        else if(arr[i]==k){
        }
    else{
        if(arr[i]+stock<k)
        {     
            System.out.println("NO "+(i+1));
             flag=false;
             break;
        }
        else if(arr[i]+stock==k){
        }
        else{
               stock=arr[i]+stock-k;
        }
    }
      }
      if(flag)
      System.out.println("YES");
     

}


sc.close();


}
}