package Array;

public class linear_search {
    //function
    public static int linear_srch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[]={12,45,78,9,64,2323,45,02};
        int key =0;
        //call
     int index=   linear_srch(number, key);
        if(index== -1){
            System.err.print("number not found");

        }
        else{
            System.out.print("key is at index"+ " " + index);
        }
    }
    
}
