import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		boolean plus = true;
		int cnt = 0;

		for(int i = 1; i <= t; i++) {
			if(cnt == n * 2) plus = false;
			if(cnt == 1) plus = true;

			if(plus) cnt++;
			else cnt--;
		}

		System.out.println(cnt);
		sc.close();
    }
}