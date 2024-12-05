import java.util.*;
//import java.io.*;



public class MinionChefandBnana {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int h=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        max=Math.max(max,a[i]);
    }
    int ans=binarySearch(a,1,max,h);
    System.out.println(ans);
}
sc.close();

}
        
    public static int binarySearch(int arr[],int start,int end,int hours){
         
        while(start<=end){
            int mid=(start+end) /2;
            int k=0;
            for(int i=0;i<arr.length;i++){
              if(arr[i]%mid==0){
                k+=arr[i]/mid;
              }
              else{
                k+=arr[i]/mid +1;
              }
           
            }
            if(k<=hours){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }


}



// static int binarySearch(int arr[],int beg,int end,int item){
//     int c=0;
//     while(beg<=end){
//         int mid=(beg+end)/2;
//         c=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%mid==0){
//                 c+=arr[i]/mid;
//             }
//             else{
//                 c+=arr[i]/mid + 1;
//             }
//         }

// }
// return c;

// }
// if(c<=item){
//     end=mid-1;
// }
// else{
//     beg=mid+1;
// }
// }
// return beg;