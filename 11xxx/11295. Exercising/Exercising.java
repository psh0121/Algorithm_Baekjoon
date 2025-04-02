import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;

		while (sc.hasNext()) {
			int l = sc.nextInt();
			if(l == 0) break;

			int n = sc.nextInt();

			System.out.println("User " + num);
			num++;

			for(int i = 0; i < n; i++) {
				int walk = sc.nextInt();
				int distance = walk * l;

				System.out.printf("%.5f\n", (double)distance / 100000);
			}
		}

		sc.close(); 
    }
}
