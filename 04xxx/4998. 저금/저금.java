import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      double n = sc.nextDouble();
      double b = sc.nextDouble();
      double m = sc.nextDouble();

      int year = 0;

      while (n <= m) {
        n += (n * (b / 100));
        year++;
      }

      System.out.println(year);
    }
		sc.close();
    }
}
