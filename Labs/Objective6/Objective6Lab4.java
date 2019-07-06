public class Objective6Lab4 {
  public static void main(String[] args) {
    int counter, total;
    total = 0;
    counter = 1;

    while (counter <= 20) {
      total = counter + total;
      counter = counter + 1;
    }
    System.out.println(total);
  }
}
