public class inverted_half_peramid_with_number {
    
    // function designed for inverted with number
    public static void inverted_with_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        inverted_with_number(5);
        
    }
    
}
