package Array;

import java.util.*;



public class input_use{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //input array
    int marks[] =new int[3];
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();   System.out.println("Marks of Hindi:-"+marks[0]);
    System.out.println("Marks of Eng:-"+marks[1]);
    System.out.println("marks of Science:- "+marks[2]);
sc.close();
}    
}