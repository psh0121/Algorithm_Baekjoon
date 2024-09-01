import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int beforeCnt = 0;

		int zeroCnt = 0;
		int missCnt = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				beforeCnt = sc.nextInt();
				continue;
			}

			int curCnt = sc.nextInt();

			if(beforeCnt > curCnt) zeroCnt += beforeCnt - curCnt;
			else missCnt += curCnt - beforeCnt;

			beforeCnt = curCnt;
		}

		System.out.println(zeroCnt + " " + missCnt);
        sc.close();
    }
}
