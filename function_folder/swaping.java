import java.util.*;
public class  swaping{
     public static void swapno( int a ,int b){
         a=a+b;
          b=a-b;
         a=a-b;
        System.out.println( "Current value is: "+a);
        System.out.println("Current value is:"+b);


     }


    public static void  main(String args[]){
        
        swapno(10 ,20);
        swapno(26 ,23);


    }
}