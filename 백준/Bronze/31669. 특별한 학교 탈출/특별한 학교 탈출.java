import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 선생님수
		int m = sc.nextInt();	// 수업시간수

		String[] timeTbl = new String[n];
		for(int i = 0; i < n; i++) timeTbl[i] = sc.next();

		for(int i = 0; i < m; i++) {
			boolean isEscape = true;

			for(int j = 0; j < n; j++) {
				if(timeTbl[j].charAt(i) == 'O') {
					isEscape = false;
					break;
				}
			}

			if (isEscape) {
				System.out.println(i + 1);
				return;
			}
		}

		System.out.println("ESCAPE FAILED");
		sc.close();
    }
}