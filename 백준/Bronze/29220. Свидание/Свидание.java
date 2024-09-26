import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);

		for(int i = n-1; i >= 0; i--) {
			k -= arr[i];

			if(k <= 0) {
				if(i != 0) System.out.println("YES");
				else System.out.println("NO");
				return;
			}
		}

		System.out.println("NO");
		sc.close();
    }
}
