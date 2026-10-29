import java.util.Scanner;

public class SwCase {
 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int x = in.nextInt();
    
    System.out.print("Enter second number: ");
    int y = in.nextInt();

    System.out.print("Enter operation: ");
    char z = in.next().charAt(0);

    int rez;
    switch (z) {
      case '-' : rez = x-y; System.out.println(rez); break;
      case '+' : rez = x+y; System.out.println(rez); break;
      case '/' : rez = x/y; System.out.println(rez); break;
      case '*' : rez = x*y; System.out.println(rez); break;
      default: System.out.println("Error operation");
    }
  } 
}
