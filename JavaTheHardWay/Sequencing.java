import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args){
    Scanner Keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print( "How much is the purchase price? ");
    price = Keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price);
    System.out.println( "Sales tax:\t" + salesTax);
    System.out.println("Total cost:\t" + total);
  }
}
//3. I'm not surprised that there is no longer an error.  Even though "price"
//isn't given a value in line 8, it still is given a value before it is used
//in a formula so the code will compile and it will work as intended.
