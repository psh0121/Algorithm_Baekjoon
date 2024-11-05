import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int minNum = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			minNum = Math.min(minNum, arr[i]);
		}

		for(int i = 1; i <= minNum; i++) {
			boolean trueFlag = true;

			for(int j = 0; j < n; j++) {
				if(arr[j] % i != 0) {
					trueFlag = false;
					break;
				}
			}

			if(trueFlag) {
				System.out.println(i);
			}

		}
		sc.close();
    }
}
