import java.util.Scanner;


public class j {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           double a;
           System.out.println("enter the value of a");
           a = sc.nextDouble();
           double b;
           System.out.println("enter the value of b");
           b = sc.nextDouble();
           double c ;
           System.out.println("enter the vlaue of c");
           c = sc.nextDouble();
           double result = b*b - 4*a*c;

           if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a); 
            System.out.println("The roots are " + r1+"  and " + r2+".");
           }
           else if (result == 0) {
            double r1 = -b / (2.0 * a);
            System.out.println("the root is "+r1+".");
           }
           else {
            System.out.println("the equation has unreal roots");
           }
        }
    }
}
