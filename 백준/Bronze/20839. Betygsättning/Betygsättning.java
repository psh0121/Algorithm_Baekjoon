import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double c = sc.nextDouble();
		double e = sc.nextDouble();
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		String grade = "";
		
		if(x >= a && y >= c) grade = "A";
		else if(y >= c) {
			if(x >= a / 2) grade = "B";
			else grade = "C";
		}
		else {
			if(y >= c / 2) grade = "D";
			else grade = "E";
		}
		
		System.out.println(grade);
	}
}         