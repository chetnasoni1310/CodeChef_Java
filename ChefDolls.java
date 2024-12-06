import java.util.*;
import java.lang.*;
import java.io.*;

class ChefDolls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
int t=sc.nextInt(); 
while(t-->0){
int n=sc.nextInt();
int arr[]=new int[n+1];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
// System.out.println(Arrays.toString(arr));
for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
      }
    }
}
// System.out.println(Arrays.toString(arr));
     
for(int i=0;i<n+1;i=i+2)
{
 if(arr[i]!=arr[i+1]){
 System.out.println(arr[i]);
     break;
 }
}
}
sc.close();

	}
}
