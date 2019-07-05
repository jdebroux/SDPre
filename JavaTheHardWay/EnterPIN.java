import java.util.Scanner;

public class EnterPIN{
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, entry2;


    password = "secret";
    pin = 12345;

    System.out.println( "WELCOME TO THE BANK OF JAVA.");
    System.out.println( "ENTER YOUR PASSWORD: ");
    entry2 = keyboard.next();

    while (!entry2.equals(password)){
      System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      entry2 = keyboard.next();
    }

    System.out.println( "ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print( "ENTER YOUR PIN: ");
      entry=keyboard.nextInt();
    }
    System.out.println("\nPASSWORD AND PIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
