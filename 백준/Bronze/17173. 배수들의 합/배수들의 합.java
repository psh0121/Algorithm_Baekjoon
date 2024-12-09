import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[m];
		for(int i = 0; i < m; i++) arr[i] = sc.nextInt();

		int result = 0;

		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < m; j++) {
				if(i % arr[j] == 0) {
					result += i;
					break;
				}
			}
		}

		System.out.println(result);
		sc.close();
    }
}
