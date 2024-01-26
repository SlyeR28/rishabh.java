import java.util.Scanner;

public class scanner1{
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int age; 
      System.out.println("enter your age");
      age = sc.nextInt();

        if (age>18) {
          System.out.println("adult");
        } else {
          System.out.println("not adult");
       }
    }
   }
 }