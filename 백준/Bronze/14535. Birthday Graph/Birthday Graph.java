import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] month = {
				"Jan", "Feb", "Mar", "Apr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
			};

		int test = 1;
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;

			int[] cnt = new int[12];

			for(int i = 0; i < n; i++) {
				int d = sc.nextInt();
				int m = sc.nextInt();
				int y = sc.nextInt();

				cnt[m - 1]++;
			}

			System.out.println("Case #" + test + ":");
			test++;

			for(int i = 0; i < month.length; i++) {
				System.out.println(month[i] + ":" + "*".repeat(cnt[i]));
			}
		}
		sc.close();
    }
}
