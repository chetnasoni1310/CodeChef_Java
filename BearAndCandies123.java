import java.util.*;
//import java.io.*;



public class BearAndCandies123 {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int a=sc.nextInt();
    int b=sc.nextInt();
     int candy=1;
     int capa=0;
     int capb=0;
     while(capa<=a && capb<=b){
        capa+=candy;
        candy++;
        capb+=candy;
        candy++;
     }
    if(capa>a){
        System.out.println("Bob");
    }
    else{
        System.out.println("Limak");
    }
}


sc.close();


}
}
// while(candy<=a+b){
//     if(capa<=a){
//         candy++;
//         capa=capa+candy;
//     }
//     else if(capa>a){
//         System.out.println("Bob");
//         break;
//     }
//     if(capb<=b){
//         candy++;
//         capb=capb+candy;

//     }
//     else if(capb>b){
//         System.out.println("Limak");
//         break;
//     }
//    }