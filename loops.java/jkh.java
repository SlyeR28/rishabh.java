import java.util.Scanner;

public class jkh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the input");
        n =sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                for(int k = 1; k <= i; k++){
                  System.out.print(" *");
                }
                System.out.print("");
            }
             System.out.println(" ");
             sc.close();
        }
        
    }
}
