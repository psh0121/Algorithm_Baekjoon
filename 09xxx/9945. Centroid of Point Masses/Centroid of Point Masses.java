import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = 1;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n < 0) break;

			long totalM = 0;
			long totalMX = 0;	// a
			long totalMY = 0;	// b

			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int m = sc.nextInt();

				totalM += m;
				totalMX += m * x;
				totalMY += m * y;
			}

			System.out.printf("Case %d: %.2f %.2f\n", caseNum, (double)totalMX / totalM, (double)totalMY / totalM);
			caseNum++;
		}
		sc.close(); 
    }
}
