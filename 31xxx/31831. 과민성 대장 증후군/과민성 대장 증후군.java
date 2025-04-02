import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long currStress = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			long getStressNum = sc.nextLong();
			currStress += getStressNum;

			if(currStress < 0) currStress = 0;

			if(currStress >= m) cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}