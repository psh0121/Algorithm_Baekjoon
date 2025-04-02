import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			if(n == 0 && m == 0 && k == 0) break;

			int leftVote = n - m - k;
			int requireVote = (n / 2) + 1;	// 최소 충족 투표수
			int curVote = m;

			// 이미 최소 충족 투표수 충족시
			if(requireVote <= curVote) System.out.println(0);
			else {
				// 추가적으로 필요 투표수
				int needVote = requireVote - curVote;

				// 남은 투표안에서 해결 가능시
				if(needVote <= leftVote) {
					System.out.println(needVote);
				}
				else {
					System.out.println(-1);
				}
			}
		}
		sc.close(); 
    }
}
