public class prime_number {
    public static boolean prime(int n) {
        
        for(int i=2;i<n;i++){
            // optimal sol we can check  only root n in java we can write root n math.sqrt.(n);
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(4));
        
    }
    
}
