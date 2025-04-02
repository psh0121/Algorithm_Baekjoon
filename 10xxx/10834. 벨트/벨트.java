import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int direction = 0;
		int spin = 0;

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int s = sc.nextInt();

			if(s == 1) {
				if(direction == 0) direction = 1;
				else direction = 0;
			}

			if(i == 0) spin = b / a;
			else {
				spin = spin / a * b;
			}
		}

		System.out.println(direction + " " + spin);
		sc.close();
    }
}
