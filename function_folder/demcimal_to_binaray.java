public class demcimal_to_binaray {
     public static void demcimalconversion(int n){
        int old_n=n;
        int decimal=0;
        int pow=0;
        while (n>0) {
            int rem =n%2;
            decimal = decimal+(rem *(int)Math.pow(10,pow)); 
            pow++;
            n=n/2;

            
        }
        System.out.println("binary of "+old_n+"="+ decimal);
     }
    public static void main(String[] args) {
        demcimalconversion(5);
        demcimalconversion(20);
        demcimalconversion(50);
        
    }
    
}
