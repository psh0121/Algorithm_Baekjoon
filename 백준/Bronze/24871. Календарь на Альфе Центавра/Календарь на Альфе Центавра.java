import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int w = sc.nextInt();

		int i = sc.nextInt();
		int j = sc.nextInt();
		long k = sc.nextLong();

		i--;
		j--;
		k--;

		System.out.println((char)('a' + (d*m*k + d*j + i) % w));
		
        sc.close();
    }
}
