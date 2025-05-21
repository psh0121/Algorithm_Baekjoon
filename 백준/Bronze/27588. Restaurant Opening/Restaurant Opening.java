import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minPrice = Integer.MAX_VALUE;

        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                int price = 0;

                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < m; j++) {
                        int distance = Math.abs(r - i) + Math.abs(c - j);
                        int cnt = arr[i][j];

                        price += distance * cnt;
                    }
                }

                minPrice = Math.min(minPrice, price);
            }
        }

        System.out.println(minPrice);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
