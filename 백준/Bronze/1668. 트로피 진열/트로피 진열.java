import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int leftMax = arr[0];
		int leftRes = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] > leftMax) {
				leftMax = arr[i];
				leftRes++;
			}
		}

		int rightMax = arr[n-1];
		int rightRes = 1;
		for(int i = n-2; i >= 0; i--) {
			if(arr[i] > rightMax) {
				rightMax = arr[i];
				rightRes++;
			}
		}

		System.out.println(leftRes);
		System.out.println(rightRes);
		sc.close();
    }
}
