import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mod = 45678;
		int result = 5;

		for(int i = 1; i < n; i++) {
			result = (result + (i + 2) * 3 - 2) % mod;
		}

		System.out.println(result);

		sc.close();
    }
}
