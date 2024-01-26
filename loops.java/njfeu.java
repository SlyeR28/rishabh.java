import java.util.Scanner;


public class njfeu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter value");
    n = sc.nextInt();

    for(int i = 1; i <= n; i++){  //outer loop start (for rows)
        for(int j = 1; j <= n-i+1; j++){ //inner loop start(for columns)
            System.out.print(" "); 
        } //inner loop closes
        for(int k = 1; k <= i; k++){ //inner most loop for maintaing spaces
            System.out.print("*");
        } //inner most loop closes
        System.out.println("");//outer loop closes
        sc.close();
    }
     }  
}
