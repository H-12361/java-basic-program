public class subarray_print{
    
    public static void subarray_pri(int number[]){
        for(int i=0;i<=number.length;i++){
            int start= i;
            for(int j=i;j<number.length;j++){
                int  end =j;
            
            for(int k=start;k<= end ;k++){//use for print  the  subarray 
                System.out.print(number[k]+" ");
            }
            System.err.println();
        }

        }
        System.out.println();

    }
    
    
    public static void main(String[] args) {
        int number[]={45,12,32,45,7,15};
        subarray_pri(number);
        
    }
}