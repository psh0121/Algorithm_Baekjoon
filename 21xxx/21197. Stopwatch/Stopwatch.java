import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int beforeTime = 0;
		boolean stopFlag = true;

		int totalTime = 0;

		for(int i = 0; i < n; i++) {
			int curTime = sc.nextInt();

			if(stopFlag) stopFlag = false;
			else {
				totalTime += curTime - beforeTime;
				stopFlag = true;
			}

			beforeTime = curTime;
		}

		if(stopFlag) System.out.println(totalTime);
		else System.out.println("still running");
		sc.close();
    }
}
