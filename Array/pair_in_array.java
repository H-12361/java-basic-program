public class pair_in_array {
    public static void pair_array(int number[]){
        for(int i=0;i<number.length;i++){
            int start=number[i];
            for(int j=i+1;j<number.length;j++){
               System.out.print(" ("+start +","+number[j]+")");
            }
            System.out.println();
        }
       
    }




    public static void main(String[] args) {
     int number[]={2,4,6,8,10};    
      pair_array(number);
    }

}
