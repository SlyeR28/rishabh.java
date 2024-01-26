import java.util.Scanner;


public class natural {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int start = 1;
            System.out.println("enter the  number till you want sum");
            int end = sc.nextInt();
            int sum = 0;

            while (start<=end) {
            sum = sum + start;
            start++;
            }
            System.out.println("sum of number is "+sum+ ".");
        }
    }
    
}
