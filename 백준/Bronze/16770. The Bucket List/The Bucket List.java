import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] time = new int[1001];
    int result = 0;

    for(int i = 0; i < n; i++) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      int b = sc.nextInt();

      for(int j = s; j <= t; j++) {
        time[j] += b;
        result = Math.max(result, time[j]);
      }
    }

    System.out.println(result);
		sc.close();
    }
}
