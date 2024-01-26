import java.util.Scanner;


public class jgh {
    public static void main(String[] args) {
       try ( Scanner sc = new Scanner(System.in)){
       int x, y, z;
       System.out.println("check the traingle wheter a equilateral, isosecles, scalene");
       System.out.println("enter the value of x");
       x = sc.nextInt();
      System.out.println("enter the value of y");
       y = sc.nextInt();
      System.out.println("enter the value of z"); 
       z = sc.nextInt();
       

       if (x == y && y == z) {
        System.out.println("triangle is equilateral");
       } 
       else if(x == y || y == z || z == x){
        System.out.println("triangle is isosecles ");
       }
       else {
        System.out.println("triangle is scalene");
       }
       
       }
      
    }
    
}
