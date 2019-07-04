import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? ");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age<13){
      System.out.println("\ttoo young to create a Facebook account" );
    }
    if (age>=13){
      System.out.println("\told enough to create a Facebook account");
    }
    if (age<16){
      System.out.println("\ttoo young to get a driver's license");
    }
    if (age>=16){
      System.out.println("\told enough to get a driver's license");
    }
    if (age<18){
      System.out.println("\ttoo young to get a tattoo");
    }
    if (age>=18){
      System.out.println("\told enough to get a tattoo");
    }
    if (age<21){
      System.out.println("\ttoo young to drink alcohol");
    }
    if (age<=21){
      System.out.println("\told enough to drink alcohol");
    }
    if (age<35){
      System.out.println("\ttoo young to run for President of the U.S. (yes, even if you have a spray tan)");
      System.out.println("\t\t(How sad!)");
    }
    if (age>=35){
      System.out.println("\told enough to run for President of the U.S. (spray tan still not necessary)");
      System.out.println("\t\t(How awesome!)");
    }
    if (age>=65){
      System.out.println("\told enough to retire!");
    }
    if (age<65){
      System.out.println("\tmost likely too young to retire");
      
    }
  }
}
//1. Just "You are: " gets printed because all of the if statements are false so nothing else gets printed.
//
