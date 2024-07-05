import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int totalA = 0;
		int totalB = 0;
		int totalC = 0;

		int minCnt = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			totalA += a;
			totalB += b;
			totalC += c;

			if(totalA < 30 || totalB < 30 || totalC < 30) {
				System.out.println("NO");
				continue;
			}

			minCnt = Math.min(totalA, totalB);
			minCnt = Math.min(minCnt, totalC);

			System.out.println(minCnt);

			totalA -= minCnt;
			totalB -= minCnt;
			totalC -= minCnt;
		}
		
		sc.close();
    }
}