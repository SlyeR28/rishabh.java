import java.util.Scanner;


public class java {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)){
        int month;
        System.out.println("enter the month(1-12)");
        month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
               System.out.println("may");
               break;
            case 6:
               System.out.println("june");
               break;
            case 7:
               System.out.println("july");
               break;
            case 8:
               System.out.println("august");
               break;
            case 9:
               System.out.println("september");
               break;
            case 10:
               System.out.println("october");
               break;
            case 11:
               System.err.println("novemeber");
               break;
            case 12:
               break;   
            default:
             System.out.println("\"invalid input! enter month between(1-12)");
                break;
        
        }

    }
 }
}