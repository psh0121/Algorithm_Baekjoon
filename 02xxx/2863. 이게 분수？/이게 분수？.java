import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		double maxNum = Double.MIN_VALUE;
		int rotateCnt = 0;
		
		for(int i = 0; i < 4; i++) {
			double cal = a/c + b/d;
			
			double tempA = a;
			double tempB = b;
			double tempC = c;
			double tempD = d;
			
			if(cal > maxNum) {
				maxNum = cal;
				rotateCnt = i;
			}
			
			a = tempC;
			b = tempA;
			c = tempD;
			d = tempB;
		}
		
		System.out.println(rotateCnt);
	}
}

