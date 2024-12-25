import java.util.*;
//import java.io.*;



public class Christ_Chores {


public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x>=7)
    {
        System.out.println(3);
    }
    else {
        int[]arr={1,2,4};
        int count=0;
        for(int i:arr)
        {
            if(x>=i)
            {
                count++;
                x-=i;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }
    
   




sc.close();


}
}