import java.util.*;
//import java.io.*;



public class WaveyPolynomialsQuery {

 public static int binarysearch(int[]arr,int n,int v){
      int start=0;
      int end=n-1;
      int ans=0;
      while(start<=end){
        int mid=start+ (end-start)/2;
        if(arr[mid]==v){
            return -1;
        }
        else if(arr[mid]<v){
            start=mid+1;
        }
        else{
            ans=mid;
            end=mid-1;
        }
      }
      return ans;

 }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
int[]roots=new int[n];
for(int i=0; i<n; i++){
    roots[i]=sc.nextInt();
}
while(q-->0){
    int v=sc.nextInt();
    int ans=binarysearch(roots, n, v);
    if(ans==-1){
        System.out.println("0");
        break;
    }
    else if(ans==0 || (ans-n)%2 ==0){
        System.out.println("POSITIVE");
    }
    else{
        System.out.println("NEGATIVE");
    }
}

sc.close();


}
}