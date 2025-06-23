public class optmise_max_sum {
    public static void optmise_sol_max_sum(int number[]){
        int currentsum=0;
        int max_sum=Integer.MIN_VALUE;
        //use for optmise
        int prefix[]=new int [number.length];
         prefix[0]=number[0];
        for(int i=1;i<number.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }


        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end=j;
            
             currentsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            }
            if(max_sum<currentsum){
                max_sum=currentsum;
            }
        }
        System.out.println("your max sum is "+max_sum);
    }

    public static void main(String args[]){
        int number[]={1,-2,6,-1,3};
        optmise_sol_max_sum(number);

    }
}