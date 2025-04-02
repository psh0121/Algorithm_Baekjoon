import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] nArr = new int[n];
			for(int j = 0; j < n; j++) nArr[j] = sc.nextInt();

			int[] mArr = new int[m];
			for(int j = 0; j < m; j++) mArr[j] = sc.nextInt();

			int cnt = 0;

			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(nArr[j] == mArr[k]) {
						cnt++;
						break;
					}
				}
			}

			System.out.println(cnt);
		}
        sc.close();
    }
}
