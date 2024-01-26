import java.util.Scanner;


public class swapped {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
       int x, y, z; //int float double
       System.out.println("enter the value of x");
        x = sc.nextInt();
        System.out.println("enter the value of y");
        y = sc.nextInt();
        
        z = x;
        x = y;
        y = z;

        System.out.println("swaped number are:" +x+" \n "+y+".");
      }
   }
}