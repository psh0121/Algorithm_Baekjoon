import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int n = sc.nextInt();

    int result = Integer.MAX_VALUE;

    for(int i = 0; i < n; i++) {
      int money = sc.nextInt();
      int m = sc.nextInt();

      int startIdx = -1;
      int endIdx = -1;

      for(int j = 0; j < m; j++) {
        int airport = sc.nextInt();

        if(start == airport) startIdx = j;
        if(end == airport) endIdx = j;
      }

      if(startIdx == -1 || endIdx == -1) continue;

      if(endIdx > startIdx) result = Math.min(result, money);
    }

    System.out.println(result == Integer.MAX_VALUE ? -1 : result);
		sc.close();
    }
}
