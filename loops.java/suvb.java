import java.util.Scanner;
public class suvb {
    public static int star(int h){
      Scanner sc = new Scanner(System.in);
      int n = 1;
      System.out.println("enter the number");
      n = sc.nextInt(); 

      for(int i = 1; i <= n; i++){
        for(int j =1; j <= i; j++){
          System.out.print("* ");
        }
        System.out.println("");
        sc.close();
      }
      return n;
    }

    public static void main(String[] args) {
      System.out.println(star(6));
      System.out.println("7");
    }
}
 