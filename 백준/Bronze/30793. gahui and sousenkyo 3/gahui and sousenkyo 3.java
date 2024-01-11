import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		String result;
		
		double val = p / r;
		
		if(val < 0.2) result = "weak";
		else if(val >= 0.2 && val < 0.4) result = "normal";
		else if(val >= 0.4 && val < 0.6) result = "strong";
		else result = "very strong";
		
		System.out.println(result);
	}
}         
