import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int maxSec = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			int sec = sc.nextInt();

			if(sec > maxSec) maxSec = sec;
		}

		int multiValue = s * maxSec;
		double result = (double)multiValue / (double)1000;

		System.out.println((int)(Math.ceil(result)));
		sc.close();
    }
}