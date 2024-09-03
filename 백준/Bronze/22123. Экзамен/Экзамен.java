import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split(" ");
			LocalTime start = LocalTime.parse(input[0]);
			LocalTime end = LocalTime.parse(input[1]);
			int k = Integer.parseInt(input[2]);

			// 초로 변환
			long startSec = start.toSecondOfDay();
			long endSec = end.toSecondOfDay();

			// 기간 계산
			long duractionSec;
			
			if (endSec == startSec) {
				duractionSec = 24 * 3600;
			}
			else if(endSec >= startSec) {
				// 당일종료
				duractionSec = endSec - startSec;
			}
			else {
				// 다음날 시험종료
				duractionSec = (24 * 3600 - startSec) + endSec;
			}

			long solveSec = k * 60;
			long oneHourSec = 3600;

			// 계산 결과 
			if(solveSec <= duractionSec) System.out.println("Perfect");
			else if (solveSec <= duractionSec + oneHourSec) {
				System.out.println("Test");
			}
			else System.out.println("Fail");
		}
        sc.close();
    }
}
