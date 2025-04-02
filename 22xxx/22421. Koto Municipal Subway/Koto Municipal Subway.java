import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(d == 0 && e == 0) break;

			double result = Double.MAX_VALUE;

			for(int x = 0; x <= d; x++) {
				int y = d-x;
				double distance = Math.sqrt((x * x) + (y * y));
				result = Math.min(result, Math.abs(distance - e));
			}

			System.out.println(result);
		}
        sc.close();
    }
}
