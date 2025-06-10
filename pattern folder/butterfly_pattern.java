public class butterfly_pattern {
     public static void butterfly( int n){
    //star
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
     
    //space
    for(int k=1;k<=2*(n-i);k++){
        System.out.print(" ");
    }


    //star
    for(int l=1;l<=i;l++){
        System.out.print("*");
       }
        System.err.println( " ");
     }
      //star top buttom same code only reverse the condition  in outer loop
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
     
    //space
    for(int k=1;k<=2*(n-i);k++){
        System.out.print(" ");
    }


    //star
    for(int l=1;l<=i;l++){
        System.out.print("*");
       }
        System.err.println( " ");
     }
    }
    public static void main(String[] args) {
        butterfly(10);
        
    }
}
