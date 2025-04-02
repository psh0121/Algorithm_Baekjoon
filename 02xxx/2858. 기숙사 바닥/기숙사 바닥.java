import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int b = sc.nextInt();

		int sumRB = r + b;

		for(int i = 2; i <= Math.sqrt(sumRB); i++) {
			if(sumRB % i == 0) {
				int l = Math.max(i, sumRB / i);
				int w = Math.min(i, sumRB / i);

				if(l + l + (w-2) + (w-2) == r) {
					System.out.println(l + " " + w);
				}
			}
		}
		sc.close();
    }
}
