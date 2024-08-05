import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] countArr = new int[n];

		for(int i = 0; i < n; i++) {
			int cnt = sc.nextInt();
			if(cnt > 7) cnt = 7;

			countArr[i] = cnt;
		}

		int[] valueArr = new int[n];

		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				valueArr[i] = countArr[i] - 2;
			}
			else valueArr[i] = countArr[i] - 3;
		}

		int result = 0;

		for(int value : valueArr) {
			result += value;
		}

		System.out.println(result);


		sc.close(); 
    }
}
