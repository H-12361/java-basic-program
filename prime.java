import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner pri =new Scanner(System.in);
        System.out.println("enter the number");
        int number=pri.nextInt();
        boolean  isprime=true;3
        for(int i=0;i<number-1;i++){
            if(number%2==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.err.println(" number is Prime");

        }
        else{
            System.err.println("prime");
        }

    }
    
}
