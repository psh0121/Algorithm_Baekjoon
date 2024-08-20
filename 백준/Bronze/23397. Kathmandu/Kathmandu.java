import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 최소필요휴식시간 	
		int d = sc.nextInt();	// 비행시간 
		int m = sc.nextInt();	// 기내식 수 

		int[] arr = new int[m+2];
		for(int i = 1; i <= m; i++) arr[i] = sc.nextInt();
		arr[m+1] = d;

		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i+1] - arr[i] >= t) {
				System.out.println("Y");
				return;
			}
		}

		System.out.println("N");
		sc.close();
    }
}
