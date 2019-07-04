import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income, height;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? ");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old.");
    System.out.print( "how much do you weigh, " + name + "? ");
    weight = keyboard. nextDouble();

    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + ".");

    System.out.println();
    System.out.println("...");
    System.out.println();
    System.out.println("Wait! Actually, I do have one more question, " + name + ".");
    System.out.print("What is your height?");
    height = keyboard.nextDouble();

    System.out.println("Are you serious?  You're only " + height + " feet tall?  You're practically a midget!");
    System.out.println( "Now I'm done asking you questions, " + name + ".  C ya!");
  }
}

//1. No, it won't blow up because even if you enter an integer, it can be written as
//a double (ex. 25 is an integer, but 25.0 is a double but they are the same number).
//2. No, it won't blow up because a String is a word variable that doesn't matter if
//it is a number or word..  You could write that your name is "f725gx" and
//the system will recognize that and spit it back out if you ask it to print that
//variable String later on.
//3. "Joseph DeBroux" will blow up every single question.  It will blow up the integer
//and double input questions anyways because it is a word and not numbers, but the main
//reason it blows up is because there is a space included.  The system is looking for
//one answer and when you have a space between two responses the system can't comprehend
//what to do and crashes.
//4.
