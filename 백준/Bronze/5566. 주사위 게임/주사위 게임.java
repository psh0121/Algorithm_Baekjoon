import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[] board = new int[n+1];
    for(int i = 1; i <= n; i++) board[i] = sc.nextInt();

    int[] game = new int[m];
    for(int i = 0; i < m; i++) game[i] = sc.nextInt();

    int cur = 1;
    int time = 0;

    for(int i = 0; i < m; i++) {
      int turn = game[i];
      time++;

      cur += turn;

      if(cur >= n) break;

      cur += board[cur];

      if(cur >= n) break;
      if(cur < 1) cur = 1;
    }

    System.out.println(time);

		sc.close();
    }
}
