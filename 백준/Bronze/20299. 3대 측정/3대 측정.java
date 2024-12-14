import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		
		int cnt = 0;
		StringBuilder result = new StringBuilder();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a >= l && b >= l && c >= l) {
				if(a + b + c >= k) {
					result.append(a + " ");
					result.append(b + " ");
					result.append(c + " ");
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		System.out.println(result.toString().trim());
		sc.close();
    }
}
