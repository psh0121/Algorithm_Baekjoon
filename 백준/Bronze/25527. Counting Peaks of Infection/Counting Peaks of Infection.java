import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;

			int[] arr = new int[n];

			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			int[] diffArr = new int[n-1];

			for(int i = 0; i < diffArr.length; i++) {
				diffArr[i] = arr[i+1] - arr[i];
			}

			int result = 0;
			// check
			for(int i = 0; i < diffArr.length - 1; i++) {
				if(diffArr[i] > 0 && diffArr[i+1] < 0) result++;
			}

			System.out.println(result);
		}
		sc.close(); 
    }
}
