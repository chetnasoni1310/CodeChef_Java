import java.util.*;
//import java.io.*;



public class SheokandNuumber {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
ArrayList<Integer> list=validnumber();
while(t-->0){
    int n=sc.nextInt();
   int ans=binarySearchList(list,n);
   if(ans==0){
    System.out.println("0");
   }
   else if(ans>n){
    System.out.println(ans-n);
   }
   else{
    System.out.println(n-ans);
   }
}
sc.close();
}

public static ArrayList<Integer> validnumber(){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<30;i++){
         for(int j=0;j<30;j++){
            if(i!=j){
           int temp =(1<<i) +(1<<j);
            list.add(temp);
         }
        }
    }
  Collections.sort(list);
  return list;
}
 public static int binarySearchList( ArrayList<Integer> list , int n)  {
   
    int start=0;
    int end=list.size()-1;
    while(start<=end){
        int mid=start +(end-start)/2;
        if(n==list.get(mid)){
            return 0;
        }
        else if(n>list.get(mid)){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    System.out.println("start"+list.get(start));
    System.out.println(list.get(end));
    if (start >= list.size()) {
        return list.get(end); // n is larger than all elements
    } else if (end < 0) {
        return list.get(start); // n is smaller than all elements
    } else {
        int dist1 = Math.abs(list.get(start) - n);
        int dist2 = Math.abs(list.get(end) - n);
        return dist1 < dist2 ? list.get(start) : list.get(end);
    }
}
}