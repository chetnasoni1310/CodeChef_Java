import java.util.*;
//import java.io.*;



public class  SnakeEating {

public static int binarysearch(int[]arr,int query){
  int start=0;
  int end=arr.length;
  
  while(start<end){
    int mid=start+(end-start)/2;
    if(arr[mid]<query){
           start=mid+1;
    }
    else{
      end=mid;
    }
  }
  return start;
}
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int q=sc.nextInt();
    int[]arr=new int[n];
    int[]query=new int[q];
    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }
    for(int i=0;i<q;i++){
      query[i]=sc.nextInt();
    }

                                      //BAI TANGG HO GYI NICHE BRUTE FORCE SAHI H LEKIN OPTIMISED NHI H 
// int n=5;
//     int q=2;
//     int[]arr={21,9,8,5,10};
//     int[]query={10,15};
    
    Arrays.sort(arr);
    for(int i=0;i<q;i++){
      int start=binarysearch(arr,query[i]);
      // System.out.println(start);
      // this will return the starting index where elements start getting the query length
       int temp=0,count=n-start;
      //  System.out.println(count);
      for(int j=start-1;j>=0;j--){
               if(arr[j]<query[i])
               {
                   temp=arr[j]+1;
                   j--;
                            while(temp<query[i]){
                              temp++;
                              j--;
                            }
                            if(j>=0){
                                 count++;
                            }
               }
               else{
                     count++;
               }
          }
          System.out.println(count);
    }
  }
sc.close();
}
}
//                                             bhaiii masttt kia h tune lekin binarysearch se karr ab 
// for(int j=0;j<q;j++){
//   int count=0;
//   int temp=0;
//   for(int i=n-1;i>=0;i--){
//        if(arr[i]<query[j])
//        {
//            temp=arr[i]+1;
//            i--;
//                     while(temp<query[j]){
//                       temp++;
//                       i--;
//                     }
//                     if(i>=0){
//                          count++;
//                     }
//        }
//        else{
//              count++;
//        }
//   }
//   System.out.println(count);
 
//   }