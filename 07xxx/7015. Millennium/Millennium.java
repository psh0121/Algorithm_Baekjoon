import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int day = 0;

            // 현재 연도의 남은 일수 계산하여 day에 더해준다
            if(y % 3 == 0) {
                day += (20-d);
                for(int j = m+1; j <= 10; j++) day += 20;
            }
            else {
                // 장월인지 단원인지 파악한다
                boolean isBigMonth = true;
                for(int j = 2; j <= m; j++) isBigMonth = !isBigMonth;

                if(isBigMonth) day += (20-d);
                else day += (19-d);

                // 다음 달을 계산하기 위해 isBigMonth를 반대로 바꾼다
                isBigMonth = !isBigMonth;

                for(int j = m+1; j <= 10; j++) {
                    if(isBigMonth) day += 20;
                    else day += 19;

                    isBigMonth = !isBigMonth;
                }
            }
            
            // 년도를 돌아가며 일수를 파악한다
            for(int j = y+1; j < 1000; j++) {
                if(j % 3 == 0) {
                    day += 20 * 10;
                }
                else {
                    day += (20 * 5) + (19 * 5);
                }
            }

            System.out.println(day + 1);
        }
        sc.close();
    }
}