import java.util.Scanner;


public class subject {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int  x;
            System.out.println("enter the value of x");
            x = sc.nextInt();
            int y;
            System.out.println("enter the value of y");
            y = sc.nextInt();
            int multiply = x*y ;
            int addtion = x+y;
            int subtraction = x-y;
            int divide = x/y;
            int reminder = x%y;
            System.out.println("");
            System.out.println("print multiply is: "+multiply+".");
            System.out.println("print addtion is: "+addtion+".");
            System.out.println("print subtraction is: "+subtraction+".");
            System.out.println("print divide is: "+divide+".");
            System.out.println("print reminder is: "+reminder+".");


        }
    }
}
