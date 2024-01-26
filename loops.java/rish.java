import java.util.Scanner;


public class rish{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("input vlaue of n");
        n = sc.nextInt();
        int sum;
    
        sum = sc.nextInt();
         
        for(int i=0; i<=n; i++){
           sum = sum + i;
        }
        System.out.println("sum is"+sum+".");
        sc.close();
    }
}