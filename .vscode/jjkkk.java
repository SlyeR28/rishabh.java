import java.util.Scanner;


public class jjkkk {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in)){
            int num;
        System.out.println("enter the number");
        num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("enter number is even");
        } else {
            System.out.println("enter number is odd");
        }
        }
    }
    
}
