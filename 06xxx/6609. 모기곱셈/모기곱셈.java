import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
          int m = sc.nextInt(); // 성충 모기
          int p = sc.nextInt(); // 번데기
          int l = sc.nextInt(); // 유충
          int e = sc.nextInt(); // 낳는 알 수
          int r = sc.nextInt(); // 유충 생존률
          int s = sc.nextInt(); // 번데기 생존률
          int n = sc.nextInt(); // 주(week)

          for(int i = 1; i <= n; i++) {
            int newM = p / s;
            int newP = l / r;
            int newL = m * e;

            m = newM;
            p = newP;
            l = newL;
          }

          System.out.println(m);
        }
        sc.close();
    }
}
