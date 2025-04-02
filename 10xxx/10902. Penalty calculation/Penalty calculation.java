import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int bestS = Integer.MIN_VALUE;	// 가장 좋은 점수
		int bestT = 0;	// 가장 조흥 점수를 받은 시간
		int bestI = 0;	// 가장 좋은 점수를 받았던 순서

		for(int i = 1; i <= n; i++) {
			int t = sc.nextInt();
			int s = sc.nextInt();

			if(s > bestS) {
				bestS = s;
				bestT = t;
				bestI = i;
			}
			else if(s == bestS) {
				if(t < bestT) {
					bestS = s;
					bestT = t;
					bestI = i;
				}
			}
		}

		int p = bestS == 0 ? 0 : bestT + (bestI - 1) * 20;

		System.out.println(p);
		sc.close();
    }
}