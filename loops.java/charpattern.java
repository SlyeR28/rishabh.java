import java.util.Scanner;


public class charpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 'A';
        System.out.println("enter n");
        n = sc.nextInt();
        
        for(int line = 1; line <= n; line++){
            for(int chars= 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
            sc.close();
        }
    }
}
