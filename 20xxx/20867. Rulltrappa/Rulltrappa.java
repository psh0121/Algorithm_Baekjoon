import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		double s = sc.nextDouble();
		double g = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double l = sc.nextDouble();
		double r = sc.nextDouble();
		
		double lTime = 0;
		double rTime = 0;
		
		// time += 에스컬레이터 타는데 걸리는 시간 (계단수 / 1초에 움직이는 계단수)
		lTime += (m / g);
		rTime += (m / s);
		
		// time += 대기시간 (대기인원수 / 1초에 접근하는 명수) 
		lTime += (l / a);
		rTime += (r / b);
		
		if(lTime < rTime) System.out.println("friskus");
		else System.out.println("latmask");
	}
}         