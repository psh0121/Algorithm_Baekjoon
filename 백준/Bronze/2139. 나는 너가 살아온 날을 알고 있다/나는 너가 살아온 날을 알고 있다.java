import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (true) {
      int d = sc.nextInt();
      int m = sc.nextInt();
      int y = sc.nextInt();

      int[] daysArr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      if(d == 0 && m == 0 && y == 0) break;
      if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) daysArr[2] = 29;

      int days = 0;

      for(int i = 1; i < m; i++) {
        days += daysArr[i];
      }
      days += d;
      System.out.println(days);
    }
		sc.close();
    }
}
