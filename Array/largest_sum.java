package Array;

public class largest_sum {
    public static int get_largest(int number[] ) {
        int largest=0;
        for(int i =0;i<number.length;i++){
                if(largest<number[i]){
                    largest=number[i];
                }
               

         
        }
        return largest;
    
        
    }
    public static void main(String[] args) {
        int number[]={45,12,45,458,47,32};
        System.out.println("Largest value is :"+get_largest(number));
        
    }   
}
