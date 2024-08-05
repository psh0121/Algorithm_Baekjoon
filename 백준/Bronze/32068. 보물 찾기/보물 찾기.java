import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();

			int level = 0;

			while (true) {
				level++;

				if(level % 2 == 1) {
					s += level;
				}
				else {
					s -= level;
				}

				if(s == l || s == r) {
					break;
				}
			}

			System.out.println(level + 1);
		}
		sc.close(); 
    }
}
