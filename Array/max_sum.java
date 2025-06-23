public class max_sum {

   //function 
    public static void max_sum(int number[]){
        int currentsum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                int end =j;
               currentsum=0;
            //print line
            for(int k=start;k<=end;k++){
              currentsum +=number[k];

            }
            System.out.println(currentsum);
        }
        if(max_sum < currentsum){
            max_sum=currentsum;
        }
        System.out.println();
        
        }
        System.out.println("max sum is :"+ max_sum);
        
    }



    public static void main(String args[]){
        int number[]={1,-2,6,-2,3};

         max_sum(number);
    }
}