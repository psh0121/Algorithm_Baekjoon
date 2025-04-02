import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		String result = "Yes";

		for(int i = 0; i < n; i++) {
			int aCnt = 0;
			for(int j = 0; j < m; j++) {
				String str = sc.next();
				if(str.equals("A")) aCnt++;
			}

			if(aCnt != 1) {
				result = "No";
				break;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
