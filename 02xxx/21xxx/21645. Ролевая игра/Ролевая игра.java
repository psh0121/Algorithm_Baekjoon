import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n : 게임 플레이어
		// m : 레벨의 범위 (1~m)
		// k : 빨간색 배지레벨

		// 캐릭터는 k-1개 보다 많은 흰색 배지를 가질 수 없다.

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		// 1~m까지 돌아가며 하얀구슬과 빨간구슬에 얼마만큼 필요한지 파악해서 계산한다.
		int white = Integer.MIN_VALUE;
		int red = Integer.MIN_VALUE;

		for(int i = 1; i <= m; i++) {
			white = Math.max(white, i % k);
			red = Math.max(red, i / k);
		}

		System.out.println((white + red) * n);

		sc.close(); 
    }
}
