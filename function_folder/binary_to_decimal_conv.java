public class binary_to_decimal_conv {


    //decimal to binary conversion 
    public static void Binary_to_decial(int binaryno){
        int pow=0;

        // old binary number sotore for showing the real binary change into decimal
        int old =binaryno;
        int decimalNo=0;
        while (binaryno>0) {
            
        int lastdigit=binaryno%10;  
            decimalNo=decimalNo+(lastdigit*(int)Math.pow(2 ,pow));
            pow++;
           binaryno= binaryno/10;
        }
        System.err.print("decimal of  "+ old+ "="+decimalNo);
    }
    public static void main(String[] args) {
        Binary_to_decial(1010);
        
    }
}