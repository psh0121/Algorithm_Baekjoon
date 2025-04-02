import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int maxNum = Integer.MIN_VALUE;
		int cnt = 0;

		for(int i = n-1; i >= 0; i--) {
			if(arr[i] > maxNum) {
				cnt++;
				maxNum = arr[i];
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
