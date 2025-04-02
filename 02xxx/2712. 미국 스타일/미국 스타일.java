import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double value = sc.nextDouble();
			String unit = sc.next();
			
			switch(unit) {
			case "kg":
				System.out.println(String.format("%.4f", value * 2.2046) + " lb");
				break;
			case "lb":
				System.out.println(String.format("%.4f", value * 0.4536) + " kg");
				break;
			case "l":
				System.out.println(String.format("%.4f", value * 0.2642) + " g");
				break;
			case "g":
				System.out.println(String.format("%.4f", value * 3.7854) + " l");
				break;
			}
		}
	}
}

