import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int sum = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					int total = arr[i] + arr[j] + arr[k];

					if(total <= m && total > sum) {
						sum = total;
					}
				}
			}
		}

		System.out.println(sum);
		sc.close();
    }
}
