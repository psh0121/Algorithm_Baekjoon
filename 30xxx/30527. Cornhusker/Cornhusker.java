import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] l = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			l[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		int kwf = sc.nextInt();

		//알갱이수 계산
		int totalCoin = 0;
		for(int i = 0; i < 5; i++) {
			totalCoin += a[i] * l[i];
		}

		//평균
		int avgCoin = totalCoin / 5;

		// 1/1000 총 알갱이수 계산
		int result = avgCoin * n;

		// 부셀수 계산
		result /= kwf;

		System.out.println(result);

		sc.close();
    }
}
