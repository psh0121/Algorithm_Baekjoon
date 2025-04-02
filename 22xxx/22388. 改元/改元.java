import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String g = sc.next();
			if(g.equals("#")) break;

			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();

			if(y > 31) g = "?";
			else if(y == 31) {
				if(m > 4) g = "?";
				else if(m == 4) {
					if(d > 30) g = "?";
					else {}
				}
				else {}
			}
			else {}

			if(g.equals("?")) y -= 30;

			System.out.println(g + " " + y + " " + m + " " + d);
		}
		sc.close();
    }
}
