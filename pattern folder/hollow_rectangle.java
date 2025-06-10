public class hollow_rectangle {
    public static void hollow_rec(int a ,int b){
        for(int i=1;i<a;i++){
            for(int j=1;j<b;j++){
                if(i==1||j==1 || i==4 || j==4){
                     System.out.print("*" +"");

                }
                else{
                    System.out.print( " ");
                }
               
                
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        hollow_rec(5, 5);
    }
}
