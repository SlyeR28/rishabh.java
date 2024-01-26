import java.util.Scanner;


public class start2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    char ch = 'A';
    System.out.println("input");
    n = sc.nextInt();

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print((char)(ch+ j -1));
            
        }
        System.out.println("");
        sc.close();
    }
  }  
}
