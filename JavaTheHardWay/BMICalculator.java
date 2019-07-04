import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, pounds, height;
    int feet, inches;

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextInt();

    System.out.print( "Your height (inches): ");
    inches = keyboard.nextInt();

    System.out.print( "Your weight in lbs: ");
    pounds = keyboard.nextDouble();

    height = feet*12 + inches;

    m = height / 39.37;

    kg = pounds / 2.205;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
