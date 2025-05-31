import java.util.*;
public class tax_calculate{ 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int income= sc.nextInt();
        int tax =0;
        if(income<500000){
            tax=0;
        
        
        }else if(income>50000 && income<100000)
         {    tax=(income/100)*20;

        }
        else if 
            (income>1000000)
                {
                    tax=(income/100)*30;
               }
                System.out.println("Your payable tax is"+tax);
    }

};