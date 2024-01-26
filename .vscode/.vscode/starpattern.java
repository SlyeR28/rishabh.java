import java.util.Scanner;


public class starpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter thr number");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("");
        }
        for(int j = 1; j <= i; j++){
            System.out.println("* ");
            sc.close();
        }


    }
}