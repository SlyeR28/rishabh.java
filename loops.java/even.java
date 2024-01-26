import java.util.Scanner;


public class even {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int start = 1;
            int end = 100;
            System.out.println("print the even number between " + start +" and "+ end +" are: ");

            while (start <= end) {
                if (start%2 == 0) {
                    System.out.println(start);
                }
               start++;
            
            }
        }
    }
    
}
