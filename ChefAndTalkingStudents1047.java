import java.util.*;
//import java.io.*;



public class ChefAndTalkingStudents1047 {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
while(t-->0){
     String str=sc.nextLine();
    //  System.out.println("Before Chef Entry : "+str);
     StringBuilder result=new StringBuilder();
     int count=0;
     for(int i=0; i<str.length();i++){
        if(str.charAt(i)=='*'){
             result.append('*');        
        }
        else if(str.charAt(i)=='<'){
            result.append('>');  
        }
        else{
            result.append('<');        
        }
     }
    //  System.out.println("After Chef Entry : "+result);
     for(int i=0; i<result.length()-1;i++){
        if(result.charAt(i)=='>' && result.charAt(i+1)=='<'){
                count++;
        }
     }
     System.out.println(count);
}


sc.close();
}
}