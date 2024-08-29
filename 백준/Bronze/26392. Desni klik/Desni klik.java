import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int min = r;
			int max = 1;

			for(int j = r; j > 0; j--) {
				String str = sc.next();
				if(str.contains("#")) {
					min = Math.min(min, j);
					max = Math.max(max, j);
				}
			}

			System.out.println(max - min);
		}
        sc.close();
    }
}
