import java.util.Scanner;


public class practi{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n;
     
     System.out.println("enter the value of n");
    n = sc.nextInt();

    for(int i =1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println("");
        sc.close();
    }
    }
}