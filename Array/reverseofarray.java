
public class  reverseofarray{
    public static void reverno(int number[]){
       int first=0, last=number.length-1;
       while(first<last){
        int temp=number[last];
        number[last]=number[first];
        number[first]=temp;
        first++;
        last--;
       }
    }
    
    
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,78,99};
         //function call 
         reverno(number);
         //print the  reverse number
         for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
         }
    }
}