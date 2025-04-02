import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// N명의 출제가 M명의 검수자
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n+m];

		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n+m; j++) {
				int money = sc.nextInt();
				arr[i] -= money;
				arr[j] += money;
			}

		}

		for(int i = 0; i < n+m; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
    }
}