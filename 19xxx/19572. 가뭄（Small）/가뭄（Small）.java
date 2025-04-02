import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();	// a + b
		double d2 = sc.nextDouble();	// a + c
		double d3 = sc.nextDouble();	// b + c

		double sumD = d1 + d2 + d3;
		double sumABC = sumD / 2;

		double a = sumABC - d3;
		double b = sumABC - d2;
		double c = sumABC - d1;

		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(1);
		System.out.printf("%.1f %.1f %.1f", a, b, c);
		sc.close();
    }
}