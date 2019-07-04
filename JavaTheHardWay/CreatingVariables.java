public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, shoesize;
    double seconds, e, checking, height;
    String firstName, lastName, title, boodabop;

    x = 10;
    y = 400;
    age = 39;
    shoesize = 12;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    height = 6.1;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    boodabop = "My shoesize and height are size";

    System.out.println("The variable x contains " + x );
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println(boodabop + " " + shoesize + " " + "and" + " " + height + " " + "feet tall.");
  }
}
