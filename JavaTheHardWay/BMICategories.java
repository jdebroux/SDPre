import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, feet, inches, weight, height, kg, m;

    System.out.println("Please enter your height (only feet): ");
    feet = keyboard.nextDouble();

    System.out.println( "Please enter your height (inches): ");
    inches = keyboard.nextDouble();

    System.out.println( "Please enter your weight (lbs): ");
    weight = keyboard.nextDouble();

    height = feet*12 + inches;
    kg = weight/2.205;
    m = height/39.37;
    bmi = kg/(m*m);

    System.out.print( "BMI category: ");
    if (bmi<15.0){
      System.out.println( "very severely underweight");
    }
    else if (bmi <= 16.0){
      System.out.println( "severely underweight");
    }
    else if (bmi<18.5){
      System.out.println( "underweight");
    }
    if (bmi < 25.0) {
      System.out.println( "normal weight");
    }
    else if (bmi < 30.0){
      System.out.println( "overweight");
    }
    else if (bmi<35.0){
      System.out.println( "moderately obese");
    }
    else if (bmi<40.0){
      System.out.println("severely obese");
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese");
    }
  }
}
//1. Yes
