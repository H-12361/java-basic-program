public class binomial_cofficient {
    public static int fact(int n){
        int factorial=1;

        for(int i=1;i<=n;i++){
            factorial=factorial*i;// calculate the factorial
        }
        return factorial;

    }
    public static int bio_coffecient( int n,int r){
       
        //formula nCr=n!/r!*(n!-r!)

        int n_fact=fact(n);  
        int r_fact=fact(r);

        // n_m_r fact means n-r calculation

        int n_m_rfact= fact(n-r); 
        int result=n_fact/(r_fact*n_m_rfact);
        return result;
    }
    public static void main(String[] args) {


        //function call and print at same time 
     
     System.out.println("output:"+bio_coffecient(10,2)); 
    }
    
}
