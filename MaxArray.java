import java.util.*;
// import java.io.*;



public class MaxArray {


public static void main(String[] args) {

 
Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
int n=sc.nextInt();
int max=0;
for(int i=0; i<t; i++) {
 ArrayList<Integer>list=new ArrayList<>(n);
    for(int k=0;k<n;k++)
    {
        list.add(sc.nextInt());
    }
     max=list.get(0);
    for(int j=0;j<n;j++){
           if(max<list.get(j)){
            max=list.get(j);
           }
    }
}
    System.out.println(max);

sc.close();


}
}