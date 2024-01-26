import java.util.Scanner;

public class Scannercondition {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)){
        int age = sc.nextInt();
             
        if (age>18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
    }
}
}