import java.util.Scanner;


public class sumodd {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int start = 1;
        System.out.println("enter the odd number till you want sum");
        int end = sc.nextInt();
        int sum = 0;

        while (start <= end) {
            if (start%2 == 1) {
               sum = start + sum;  
            }
             start++;
            }
           System.out.println("sum of all odd number is: "+sum+"." );
            sc.close();
        }
    }
}
