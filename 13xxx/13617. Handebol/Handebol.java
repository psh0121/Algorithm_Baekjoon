import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int result = 0;

		for(int i = 0; i < n; i++) {
			int zeroCnt = 0;
			for(int j = 0; j < m; j++) {
				if(sc.nextInt() == 0) zeroCnt++;
			}

			if(zeroCnt == 0) result++;
		}

		System.out.println(result);
		sc.close(); 
    }
}
