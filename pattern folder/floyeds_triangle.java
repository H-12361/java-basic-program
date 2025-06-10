public class floyeds_triangle {
     public static void floyde_s_triangle(int n){
    int sum=1;
     for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            System.out.print(sum +" ");
            sum++;
        }

        System.out.println( );
     }
    }
    public static void main(String[] args) {
        floyde_s_triangle(6);
        
    }
}