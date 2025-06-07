public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;//factorial return in the f container
    }


    public static void main (String agrs[]){
    //call the function
       System.out.println( "Output  is "+fact(5));    }
    
}
