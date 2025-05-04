import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 - 고른카드 제외한 모든카드 제거
		// 2 - 고른카드 버려지고 나머지 유지
		// 이과정 무한 반복
		int n = sc.nextInt();
		int p = sc.nextInt();
		int s = sc.nextInt();

		for(int i = 0; i < s; i++) {
			int m = sc.nextInt();
			boolean isP = false;

			for(int j = 0; j < m; j++) {
				if(sc.nextInt() == p) isP = true;
			}

			if(isP) System.out.println("KEEP");
			else System.out.println("REMOVE");
		}

		sc.close(); 
    }
}
