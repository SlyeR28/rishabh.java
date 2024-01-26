import java.util.Scanner;


public class iiihhh {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)){
        int number;
        System.out.println("enter the number(0-4)");
        number = sc.nextInt();

        switch (number) {
            case 0:
                System.out.println("number is 0 ");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
            case 3:
            case 4:
               System.out.println("number 2,3 or 4");
            default:
               System.out.println("number is greater than 0 or less than 4");
                break;
         }

       }
      
     }
    
  }
