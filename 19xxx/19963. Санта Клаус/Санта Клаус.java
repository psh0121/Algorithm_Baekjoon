import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int cnt = n - m -k;

		int[] arr = new int[n+1];
		for(int i = 0; i < arr.length; i++) arr[i] = i;

		for(int i = 0; i < m; i++) {
			int value1 = sc.nextInt();
			arr[value1] = 0;
		}

		for(int i = 0; i < k; i++) {
			int value2 = sc.nextInt();
			arr[value2] = 0;
		}

		System.out.println(cnt);

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.print(i + " ");
			}
		}
        sc.close();
    }
}
