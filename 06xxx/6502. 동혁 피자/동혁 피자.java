import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int i = 1;

		while (true) {
			int r = sc.nextInt();
			if(r == 0) break;
			int r2 = r * 2;
			int w = sc.nextInt();
			int l = sc.nextInt();

			System.out.print("Pizza " + i + " ");
			i++;

			double digonal = Math.sqrt((double)(w * w) + (double)(l * l));

			if(digonal <= r2) System.out.println("fits on the table.");
			else System.out.println("does not fit on the table.");
		}
		sc.close();
    }
}
