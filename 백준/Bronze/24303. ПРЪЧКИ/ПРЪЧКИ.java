import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// cm
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		// 개수
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();

		int l = sc.nextInt();
		int cnt = Integer.MAX_VALUE;

		for(int i = 0; i <= b1; i++) {
			for(int j = 0; j <= b2; j++) {
				for(int k = 0; k <= b3; k++) {
					int cm = i*a1 + j*a2 + k*a3;

					if(cm >= l) {
						cnt = Math.min(cnt, i + j + k);
					}
				}
			}
		}

		System.out.println(cnt == Integer.MAX_VALUE ? 0 : cnt);
		sc.close();
    }
}
