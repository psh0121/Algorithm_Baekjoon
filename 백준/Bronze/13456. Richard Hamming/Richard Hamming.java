import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] vArr = new int[n];
			for(int j = 0; j < n; j++) vArr[j] = sc.nextInt();
			int[] uArr = new int[n];
			for(int j = 0; j < n; j++) uArr[j] = sc.nextInt();

			int cnt = 0;

			for(int j = 0; j < n; j++) {
				if(vArr[j] != uArr[j]) cnt++;
			}

			System.out.println(cnt);
		}
        sc.close();
    }
}
