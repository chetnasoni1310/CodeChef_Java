import java.util.*;
//import java.io.*;



public class CoinTriangle {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int height=0;
    int h=height;
    while((h*(h+1))/2 <n){
        h++;
    }
    if(h==n){
        System.out.println(h);
    }
    else
    System.out.println(h-1);
}


sc.close();


}
}
// int i, j, row = 6;       
// //Outer loop work for rows  
// for (i=0; i<row; i++)   
// {  
// //inner loop work for space      
// for (j=row-i; j>1; j--)   
// {  
// //prints space between two stars  
// System.out.print(" ");   
// }   
// //inner loop for columns  
// for (j=0; j<=i; j++ )   
// {   
// //prints star      
// System.out.print("* ");   
// }   
// //throws the cursor in a new line after printing each line  
// System.out.println();   
// }