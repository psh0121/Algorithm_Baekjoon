import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int t0 = sc.nextInt();

		int[] dArr = new int[n+1];
		for(int i = 1; i <= n; i++) dArr[i] = sc.nextInt();

		int[] tArr = new int[n+1];
		tArr[0] = t0;

		for(int i = 0; i < tArr.length - 1; i++) {
			if(tArr[i] > k) {
				tArr[i+1] = tArr[i] + dArr[i+1] - Math.abs(tArr[i] - k);
			}
			else if (tArr[i] == k) {
				tArr[i+1] = tArr[i] + dArr[i+1];
			}
			else {
				tArr[i+1] = tArr[i] + dArr[i+1] + Math.abs(tArr[i] - k);
			}
		}

		int result = 0;

		for(int i = 1; i < tArr.length; i++) {
			result += Math.abs(tArr[i] - k);
		}

		System.out.println(result);

		sc.close();
    }
}
