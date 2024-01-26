import java.util.Scanner;


public class multiply {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int count = 0;
            System.out.println("enter the  number");
            int number = sc.nextInt();

            while (number>0) {
             number = number/10;
             count++;   
            }
           System.out.println("there are "+count+" digit in number");
            sc.close();
        }
        
    }
    
}
