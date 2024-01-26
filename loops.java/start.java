import java.util.Scanner;


public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the input");
        n =sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                //System.out.print(i);//printing 1 int in 1 row only
               System.out.print(j);//printing int in asencding order
            }
            System.out.println("");
            sc.close();
        }
    }
    
}
