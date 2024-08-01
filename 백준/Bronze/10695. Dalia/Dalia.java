import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			System.out.print("Case " + i + ": ");

			int size = sc.nextInt();
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();

			int[] rArr = {r1-1, r1-1, r1+1, r1+1, r1-2, r1-2, r1+2, r1+2};
			int[] cArr = {c1+2, c1-2, c1+2, c1-2, c1+1, c1-1, c1+1, c1-1};

			String result = "NO";

			for(int j = 0; j < rArr.length; j++) {
				if(rArr[j] == r2 && cArr[j] == c2) {
					result = "YES";
					break;
				}
			}

			System.out.println(result);
		}
		sc.close(); 
    }
}
