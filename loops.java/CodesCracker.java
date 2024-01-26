import java.util.Scanner;
import java.io.*;

public class CodesCracker
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Number of Seconds: ");
      int seconds = sc.nextInt();
      Runtime r = Runtime.getRuntime();
      try
      {
         System.out.println("restarting  the PC after " +seconds+" seconds.");
         r.exec("restart -s -t " +seconds);
      }
      catch(IOException e)
      {
         System.out.println("Exception: " +e);
         sc.close();
      }
   }
}