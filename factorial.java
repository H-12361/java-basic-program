import java.util.*;
public class factorial{
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Input N want to find factorial:");
      int n =sc.nextInt();
      int fact =1;
      for(int i=1;i<=n;i++){
        System.out.print(i);
        if(i<n){
            System.err.print("*");
        }
        fact*=i;
      }
      System.out.println("="+fact);

    }
}