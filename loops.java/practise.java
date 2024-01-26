import java.util.Scanner;


public class practise{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i = 1;
            System.out.println("enter the number");
            int n = sc.nextInt();
            int sum = 0;

            while (i <= n) {
                sum = sum + n*n;
                n++;
            }
            System.out.println("sum of number is "+sum+ ".");
        }
    }
}