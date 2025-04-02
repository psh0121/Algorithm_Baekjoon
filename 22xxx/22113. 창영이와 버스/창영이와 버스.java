import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cyBus = new int[m];
        for(int i = 0; i < m; i++) cyBus[i] = sc.nextInt();

        int[][] bus = new int[n+1][n+1];
        for(int i = 1; i < bus.length; i++) {
          for(int j = 1; j < bus[0].length; j++) {
            bus[i][j] = sc.nextInt();
          }
        }

        int fee = 0;
        for(int i = 0; i < m-1; i++) {
          int cur = cyBus[i];
          int next = cyBus[i+1];

          fee += bus[cur][next];
        }

        System.out.println(fee);
        sc.close();
    }
}
