import java.util.Scanner;


public class gg {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the first number");
            num1 = sc.nextInt();
            System.out.println("enter the second number");
            num2 = sc.nextInt();
        }
        if (num1>num2) {
            System.out.println("num1 is largest");
        } else {
            System.out.println("num2 is largest");
        }
    }
}
