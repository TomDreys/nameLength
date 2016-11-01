import java.util.Scanner;

public class main
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("input your name");
       String input = sc.next();
       System.out.println("the length of your name is:" + input.length());
   }
       
}
