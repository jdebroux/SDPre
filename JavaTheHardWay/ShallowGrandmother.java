import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args ){
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.print( "Enter your age: ");
    age = keyboard.nextInt();

    System.out.print( "Enter your yearly income: " );
    income = keyboard.nextDouble();

    System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
    cute = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ));

    System.out.println( "Allowed to date my grandchild? " + allowed );

    System.out.println( "I guess I have another question for you.");
    System.out.println( "Realistically, how happy do you make my grandchild, 1-10?");
    happy = keyboard.nextDouble();

    allowed2 = (age > 25 && age < 40 && (happy > 7));

    System.out.println( "Allowed to date my grandchild? " + allowed2);
  }
}
