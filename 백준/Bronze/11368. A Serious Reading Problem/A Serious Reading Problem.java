import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			long c = sc.nextLong();
			long w = sc.nextLong();
			long l = sc.nextLong();
			long p = sc.nextLong();

			if(c == 0 && w == 0 && l == 0 && p == 0) break;

			long result = (long)1;

			for(int i = 1; i <= w * l * p; i++) {
				result *= c;
			}

			System.out.println(result);

		}
		sc.close();
    }
}
