import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = sc.nextInt();

		int cnt = 0;

		for(int i = 1; i <= n / 2; i++) {
			if(arr[i] == arr[(n/2) + i]) cnt += 2;
		}

		System.out.println(cnt);
		sc.close();
    }
}
