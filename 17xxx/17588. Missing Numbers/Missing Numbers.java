import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int checkNum = 1;	// 숫자확인용
		int wrongNumCnt = 0;	// 잘못말한 숫자개수

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if(checkNum == num) {
				checkNum++;
				continue;
			}

			for(int j = checkNum; j < num; j++) {
				System.out.println(j);
				wrongNumCnt++;
			}

			checkNum = num + 1;
		}

		if(wrongNumCnt == 0) System.out.println("good job");
		sc.close();
    }
}