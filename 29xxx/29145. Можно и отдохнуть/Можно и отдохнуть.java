import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long result = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(k >= a && (k - a) % b == 0) result += (long)c;
		}

		System.out.println(result);
		sc.close();
    }
}
