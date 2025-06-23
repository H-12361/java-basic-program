package Array;

public class pass_argument_by_referance_nature {
    //function 
    public static void by_refernce(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;    
        }
    }

    public static void main(String[] args) {
       int marks[]={ 24, 56,78,98};
       //call 
       by_refernce(marks);
       //print our updated marks
       for(int i =0;i<marks.length;i++){
        System.out.println("updated marks is :"+" "+marks[i]);
       }
      
    }
    
}