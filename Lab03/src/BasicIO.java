import java.util.Date;
import java.util.Scanner;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {
	  
      Scanner stdin = new Scanner(System.in);

      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();
      
      // get Second input
      System.out.print("Enter your age: ");
      int years = stdin.nextInt();
      
      // get THird input
      System.out.print("Enter your height: ");
      int height = stdin.nextInt();

      // display output on console
      System.out.println("your name is " + name);
      System.out.println("your age is " + years);
      System.out.println(years*365);
      
      
      System.out.printf("%1$ty년 %1$tB %1$te일 현재 %2$s(%3$d)의 키는 %4$d cm입니다. ", new Date(), name, years, height );
      
      
   }  // method main

}  // class BASIC_IO
