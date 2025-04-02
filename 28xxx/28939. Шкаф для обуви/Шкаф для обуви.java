import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 선반수
		int k = sc.nextInt();	
		long m1 = sc.nextLong();
		long m2 = sc.nextLong();

		int wrongCnt = 0;	// 조건성립 안하는 신발수

		for(int i = 0; i < n; i++) {
			long h = sc.nextLong();	// 선반 높이
			long k_i = sc.nextLong();	// 신발 수

			for(int j = 0; j < k_i; j++) {
				int size = sc.nextInt();	// 신발크기 

				// 조건 성립 여부 확인
				if(size * m1 < h || size * m2 > h * k) {
					wrongCnt++;
				}
			}
		}

		System.out.println(wrongCnt);
		sc.close();
    }
}
