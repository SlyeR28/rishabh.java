import java.util.Scanner;

public class jk {
    public static void main(String[] args) {
        int percentage;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the perctange");
            percentage = sc.nextInt();
        }
        if (percentage>=60) {
            System.out.println("division1");
        }
        else if(percentage>=45 && percentage<=60)
        {
            System.out.println("division2");
        }   
        else if(percentage>=30 && percentage<=45){
        System.out.println("division3");  
        }   
        else {
            System.out.println("fail");
        }
    }
}
