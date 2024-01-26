import java.util.Scanner;


public class r {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a;
            System.out.println("input a");
            a = sc.nextInt();
            int b;
            System.out.println("input b");
            b = sc.nextInt();
            int c;
            System.out.println("input c");
            c = sc.nextInt();
            System.out.println("print the greatest input");


            if (a >= b || a >= c) {
                System.out.println("a is greatest");
            } 
            else if (b >= c ) {
                System.out.println("b is greatest");
            }
            else {
                System.out.println("c is greatest");
            }
        }
    }
    
}
