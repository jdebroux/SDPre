import java.util.Scanner;

public class ComparingNumbers{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if (first<second)
      System.out.println( first + " is LESS THAN " + second);

    if (first<=second)
      System.out.println( first + " is LESS THAN/EQUAL TO " + second);

    if (first==second)
      System.out.println(first + " is EQUAL TO " + second);

    if (first>=second)
      System.out.println(first + " is GREATER THAN/EQUAL TO " + second);

    if (first>second)
      System.out.println( first + " is GREATER THAN " + second);

    if (first!=second){
      System.out.println(first + " is NOT EQUAL TO " + second);
      System.out.println("Hey.");
    }
  }
}
//1. The "Hey." line runs no matter what.  This is because of the lack of curly braces.
//2. It works as expected.
