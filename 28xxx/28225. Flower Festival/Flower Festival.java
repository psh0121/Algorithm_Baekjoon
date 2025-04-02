import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int f = sc.nextInt();

		int car = 0;
		double time = Double.MAX_VALUE;

		for(int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			int v = sc.nextInt();

			double curTime = (f-x) / (double)v;

			if(curTime < time) {
				car = i;
				time = curTime;
			}
		}

		System.out.println(car);
        sc.close();
    }
}
