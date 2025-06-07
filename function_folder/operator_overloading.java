public class operator_overloading{
 // user define function for operator overloading 
 public static int fun1(int a,int b){
    return a+b;

 }
 //function 2 operator overloading in datatype
 public static float fun2(float a, float b){
   return  a+b;
 }
    public static void main(String[] args) {
        System.out.println("output is int data type:"+fun1(23,33));
        System.out.println("output is float data type:"+fun2(23.4f,23.884f));
    }
}