 public class test{
    public static void testcode(int number[]){
        for(int i=0;i<number.length;i++){
            int current = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+current+","+number[j]+")");
            }
                System.out.println(" ");
        }

    }
    public static void main (String args[]){
        int number[]={45,23,45,32,4,12,10};
        testcode(number);
    }
}