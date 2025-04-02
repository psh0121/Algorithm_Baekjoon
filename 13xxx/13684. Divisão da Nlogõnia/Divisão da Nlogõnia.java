import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int k = sc.nextInt();
			if(k == 0) break;

			int n = sc.nextInt();
			int m = sc.nextInt();

			for(int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				if(x == n || y == m) System.out.println("divisa");
				else {
					if(x > n && y > m) System.out.println("NE");
					else if(x > n && y < m) System.out.println("SE");
					else if(x < n && y < m) System.out.println("SO");
					else System.out.println("NO");
				}
			}
		}
		sc.close();
    }
}
