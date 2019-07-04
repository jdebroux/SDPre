import java.util.Scanner;

public class Wease10rNot{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please.");
    word = keyboard.next();

    yep = "weasel".equals(word);
    nope = ! word.equals("weasel");

    System.out.println( "You typed what was requested: " + yep);
    System.out.println( "You ignored polite instructions: " + nope);
  }
}
//Study Drill does work because you're just switching the words around on either
//side of the equals sign.  weasel=(typed word) is the same as (typed word) = weasel.
