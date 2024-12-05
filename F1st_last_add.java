
import java.util.*;
import java.lang.*;
import java.io.*;
public class F1st_last_add {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0){
			    int n=sc.nextInt();
			     int k=sc.nextInt();
			     ArrayList<Integer> arr=new ArrayList<>();
			     for(int i=0;i<n;i++){
			         arr.add(sc.nextInt());
			     }
			     System.out.println(newArray(arr,k));
                 
			}
            sc.close();
	}
	public static ArrayList<Integer> newArray(ArrayList<Integer> arr,int k)
	{   
	    while(k-->0)
	    {
	    int n=arr.size();
        if(n<2){
            return arr;
        }
        // System.out.println(n);
	    int min=arr.get(0);
	    int max=arr.get(n-1);
	    arr.remove(0);
	    arr.remove(n-1);
	    arr.add(min+max);
        // System.out.println(arr);
	    }
	    return arr;
	}
}
