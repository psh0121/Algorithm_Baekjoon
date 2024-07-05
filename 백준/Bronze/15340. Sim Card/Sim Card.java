import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int c = sc.nextInt();
			int d = sc.nextInt();

			if(c == 0 && d == 0) break;

			int minFee = 0;

			int parsTel = 30 * c + 40 * d;
			int parsCell = 35 * c + 30 * d;
			int parsPhone = 40 * c + 20 * d;

			minFee = Math.min(parsTel, parsCell);
			minFee = Math.min(minFee, parsPhone);

			System.out.println(minFee);
		}
		sc.close();
    }
}