import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		for(int i = 1; i <= c; i++){
			for(int j = 0; j < n; j++) {
				if(i % arr[j] == 0) {
					cnt++;
					break;
				}
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
