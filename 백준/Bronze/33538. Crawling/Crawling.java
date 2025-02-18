import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();   // 수영장의 길이
        int n = sc.nextInt();   // 학생수
        double t = sc.nextDouble(); // 가장 빠른 선수 기록

        for(int i = 0; i < n; i++) {
            double f = sc.nextDouble(); // 자유형 속도
            double b = sc.nextDouble(); // 배영 속도

            // 기록 계산
            double curT = (l / f) + (l / b);

            if(curT < t) {
                System.out.println("HOPE");
                return;
            }
        }

        System.out.println("DOOMED");
        sc.close();
    }
}
