import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 총문제수
		int k = sc.nextInt();	// 여태푼 문제수
		int d = sc.nextInt();	// 문제 평균난이도
		int s = sc.nextInt();	// 예측한 여태푼 문제의 난이도

		double result = (double)(d * n - s * k) / (n - k);

		System.out.println(result > 100 || result < 0 ? "impossible" : result);
		sc.close(); 
    }
}
