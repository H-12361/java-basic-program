
public class reverse_no {
    public static void main(String[] args) {
        int n =3425;
        while (n>0) {
           int lastdigit = n%10;
           System.out.print(lastdigit);
           n/=10;
            
        }
        
    }

    
} 

   
