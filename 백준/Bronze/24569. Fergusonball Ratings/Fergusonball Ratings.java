import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int good = sc.nextInt();
			int bad = sc.nextInt();

			int grade = (good * 5) - (bad * 3);
			if(grade > 40) cnt++;
		}

		System.out.println(n == cnt ? cnt + "+" : cnt);
		sc.close(); 
    }
}
