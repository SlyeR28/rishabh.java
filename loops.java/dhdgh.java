import java.util.Scanner;
public class dhdgh{

public static int multiply(int n){
  Scanner sc = new Scanner(System.in);
  int f = 1;


  for(int i = 1; i <= n; i++){
     f = f*i;
     sc.close();
  }
  return f;
   
}

 public static void main(String[] args) {
    System.out.println(multiply(5));
    System.out.println(multiply(12));
    System.out.println(multiply(12));

      }

}

