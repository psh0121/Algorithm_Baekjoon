import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();

        int[][] arr = new int[y+1][x+1];
        int cnt = 0;

        for(int i = 0; i < t; i++) {
            int xll = sc.nextInt();
            int yll = sc.nextInt();
            int xur = sc.nextInt();
            int yur = sc.nextInt();

            for(int yy = yll; yy <= yur; yy++) {
                for(int xx = xll; xx <= xur; xx++) {
                    if(arr[yy][xx] == 0) {
                        arr[yy][xx] = 1;
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
