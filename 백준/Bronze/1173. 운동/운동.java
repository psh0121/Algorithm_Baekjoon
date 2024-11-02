import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();

		if(m + T > M) {
			System.out.println(-1);
			return;
		}

		int totalTime = 0;
		int exerciseTime = 0;
		int curBeat = m;

		while (exerciseTime != N) {
			int featureBeat = curBeat + T;

			if(featureBeat > M) {
				curBeat = Math.max(m, curBeat - R);
			}
			else {
				curBeat = featureBeat;
				exerciseTime++;
			}

			totalTime++;
		}

		System.out.println(totalTime);

		sc.close();
    }
}
