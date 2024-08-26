import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

		for(int i = 1; i <= k ; i++) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int e = sc.nextInt();

			int sum = 0;

			for(int j = 0; j < n; j++) {
				int lww = sc.nextInt() * w;
				int lwe = sc.nextInt() * w;
				int lew = sc.nextInt() * e;
				int lee = sc.nextInt() * e;

				int maxValue = Math.max(lww + lew, lwe + lee);
				sum += maxValue;
			}

			System.out.println("Data Set " + i + ":");
			System.out.println(sum);
			System.out.println();
		}
        sc.close();
    }
}
