import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		double citiyTime = (double)m / x;
		double parkTime = (double)(n - m) / y;

		double totalSec = citiyTime + parkTime;
		double totalMin = totalSec / 60;

		if(t >= totalMin) System.out.println(0);
		else System.out.println((int)Math.ceil(totalMin - t));
		sc.close();
    }
}
