import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            // infection date 감염날짜
            int iMonth = sc.nextInt();
            int iYear = sc.nextInt();

            // strike date 증상발생날짜
            int sMonth = sc.nextInt();
            int sYear = sc.nextInt();

            double eit = 0.0;

            // 연말까지 도달하지 못하면  절반으로 계산
            if(iYear == sYear) {
                eit += 0.5 * (sMonth - iMonth) / (12.0 - iMonth + 1);
            }

            // 첫해는 0.5로 계산
            // 그이후는 1로 계산
            else {
                eit += 0.5 + (sYear - iYear - 1) + ((sMonth - 1) / 12.0);
            }

            System.out.printf("%.4f\n", eit);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}