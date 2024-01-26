import java.util.Scanner;


public class sumeven {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner( System.in)){
            int start = 1;
            System.out.println("enter the even number till you want sum ");
            int end = sc.nextInt();
            int sum = 0;

            while (start <= end) {
                if (start%2 == 0) {
                    sum = sum + start ;                          
                }
               start++;  
            }
            System.out.println("sum of all even number is : "+sum+ ".");
            sc.close();
        }
    }
    
}
