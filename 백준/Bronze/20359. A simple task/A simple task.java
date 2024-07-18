import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int p = 0;
		int o = 0;

		while (true) {
			if(n % Math.pow(2, p) == 0) {
				o = (int)(n / Math.pow(2, p));
				if(o % 2 == 1) break;
			}

			p++;
		}

		System.out.println(o + " " + p);
		
		sc.close();
    }
}
