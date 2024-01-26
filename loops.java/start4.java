import java.util.Scanner;


public class start4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the input");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        { 
                for (int j = n; j > i; j--){
    
                System.out.print(" ");
               }
                     for (int k = 1; k <= i; k++){
    
                    System.out.print( k+ " ");
                }
                  System.out.println();
                 sc.close();
               }
        } 

}

