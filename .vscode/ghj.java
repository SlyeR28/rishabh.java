import java.util.Scanner;


public class ghj{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           int week;
            System.out.println("enter the week days(1-7)"); 
           week = sc.nextInt();

           switch (week) {
            case 1:
                System.out.println("monday");
                break;
           case 2:
               System.out.println("teausday");
               break;
            case 3:
               System.out.println("wednesday");
               break;
            case 4:
               System.out.println("thursday");
               break;
            case 5:
               System.out.println("friday");
               break;
            case 6:
               System.out.println("saturday");
               break;
            case 7:
              System.out.println("sunday");
              break;
            default:
              System.out.println("\"Invalid input! Please enter week number(1-7)");
                break;
           }
        }
    }
}