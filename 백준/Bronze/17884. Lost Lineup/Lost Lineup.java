import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr[0] = 1;

		for(int i = 2; i <= n; i++) {
			int jimmyDis = sc.nextInt();
			arr[jimmyDis+1] = i;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
    }
}
