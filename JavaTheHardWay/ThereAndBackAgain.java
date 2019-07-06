public class ThereAndBackAgain{
  public static void main(String[] args ) {
    System.out.println( "Here." );
    erebor();
    System.out.println( "Back first time." );
    //erebor();
    System.out.println("Back second time." );
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
//1. It won't compile because "erebor;" is not a statement.  I believe
//it wants to read erebor as a variable, but it hasn't been defined so
//it won't compile.
//2. I expect it to print "Here. There. Back first time. Back second time."
//- I was right.
