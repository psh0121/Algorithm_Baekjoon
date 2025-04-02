import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int d1 = sc.nextInt();
		int t1 = sc.nextInt();
		double kt1 = 0.0;

		int h2 = sc.nextInt();
		int d2 = sc.nextInt();
		int t2 = sc.nextInt();
		double kt2 = 0.0;

		while (h1 > 0) {
			kt1 += 0.5;
			h1 -= d2;

			if(h1 <= 0) break;
			kt1 += t2 - 0.5;
		}

		while (h2 > 0) {
			kt2 += 0.5;
			h2 -= d1;

			if(h2 <= 0) break;
			kt2 += t1 - 0.5;
		}

		if(kt1 > kt2) System.out.println("player one");
		else if(kt1 < kt2) System.out.println("player two");
		else System.out.println("draw");

		sc.close();
    }
}
