import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			System.out.println(m);
			
			for(int j = 0; j < m; j++) {
				System.out.println(sc.next());
			}
			return;
		}
		sc.close();
    }
}