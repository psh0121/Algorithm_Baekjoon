import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[m][];
    for(int i = 0; i < m; i++) {
      arr[i] = new int[]{sc.nextInt(), sc.nextInt()};
    }

    Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

    int money = 0;

    for(int i = 0; i < arr.length - 1; i++) {
      int good = arr[i][0];
      int bad = arr[i][1];

      if(good >= n) continue;

      money += n - good;
    }

    System.out.println(money);
		sc.close();
    }
}
