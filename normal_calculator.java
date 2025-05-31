import java.util.*;

class normal_caculator{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value A:");
        int  a = sc.nextInt();
         System.out.println("Enter Value B:");
        int b  = sc.nextInt();
         System.out.println("Enter operator :");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':System.out.println(a+b);
                
                break;
            case '-': System.out.println(a-b);
                    break;
            case '*': System.out.println(a*b);
                  break;
            case '/':System.out.println(a/b);
                 break;
            case '%':System.out.println(a%b);
                break;


        
            default:System.out.println(" sorry My calculator not adavnce");
        }     
    }
}