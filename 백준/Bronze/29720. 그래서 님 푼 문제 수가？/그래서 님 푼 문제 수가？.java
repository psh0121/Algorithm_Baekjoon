import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int min = n - (m * k);
		int max = min + (m-1);

		if(min < 0) min = 0;

		System.out.println(min + " " + max);

		sc.close();
    }
}