import java.util.Scanner;


public class hjk {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            double temp;
            System.out.println("enter the temperature");
            temp = sc.nextDouble();
            
            if (temp >= 100) {
                System.out.println("you have a fever");
            } else {
                System.out.println("you dont have a fever");
            }

        }
    }
    
}
