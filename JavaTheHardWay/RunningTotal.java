import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    current = 1;  //Study Drill #1

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zer.");

    do{
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total+=current;

      if((current != 0))
      System.out.println("The total so far is: " + total);

      else
      System.out.println();

    }
    while ( current != 0 );
    System.out.println("The final total is: " +total);
  }
}
