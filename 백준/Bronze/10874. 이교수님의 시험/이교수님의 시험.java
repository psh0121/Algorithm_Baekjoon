import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			int rightCnt = 0;	// 맞은 문제 개수

			for(int j = 1; j <= 10; j++) {
				int correctNum = ((j - 1) % 5) + 1;	// 정답
				int stNum = sc.nextInt();	// 학생답

				if(correctNum == stNum) rightCnt++;
			}

			if(rightCnt == 10) System.out.println(i);
		}
		sc.close();
    }
}