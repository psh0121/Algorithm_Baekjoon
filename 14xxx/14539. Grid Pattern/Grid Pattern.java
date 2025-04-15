import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc, int idx) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("Case #" + idx + ":");

        // 행과열의 수를 하나하나 따져서 일일히 그려준다.
        int totalRows = r * (h+1);
        int totalCols = c * (w+1);

        for(int i = 0; i <= totalRows; i++) {
            StringBuilder line = new StringBuilder();

            for(int j = 0; j <= totalCols; j++) {
                if(i % (h+1) == 0) {
                    line.append(j % (w+1) == 0 ? '+' : '-');
                }
                else {
                    line.append(j % (w+1) == 0 ? '|' : '*');
                }
            }
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            solve(sc, i);
        }
        sc.close();
    }
}