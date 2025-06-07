public class prime_in_range {
    
    public static boolean prime(int n) {
        
        for(int i=2;i<n;i++){
            // optimal sol we can check  only root n in java we can write root n math.sqrt.(n);
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void primein_Range(int n ){
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
       System.out.println();
    }
    public static void main(String[] args) {
        primein_Range(20);
        
    }
    
}

    

