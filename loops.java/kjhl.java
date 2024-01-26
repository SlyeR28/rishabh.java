import java.util.Scanner;


public class kjhl {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int num;
        System.out.println("enter the number");
        num = sc.nextInt();

        if (num%2 != 0) {
            System.out.println("entered number is odd");
        } else {
            System.out.println("entered number is even");
        }
        }
    }
    
}
