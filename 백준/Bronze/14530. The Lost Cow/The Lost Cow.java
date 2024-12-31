import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int distance = 0;
    int sumValue = 1; // 지그재그패턴 더해지는값  

    int before = x;
    int after = 0;

    while (true) {
      after = x + sumValue;

      if(y >= Math.min(after, before) && y <= Math.max(after, before)) {
        distance += Math.abs(before - y);
        break;
      }
      else {
        distance += Math.abs(before - after);
        before = after;
        sumValue *= -2;
      }
    }

    System.out.println(distance);
		sc.close();
    }
}
