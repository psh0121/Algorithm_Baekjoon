import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a1 = sc.nextInt();
			int p1 = sc.nextInt();
			int r1 = sc.nextInt();
			int p2 = sc.nextInt();
			double r1S = Math.PI * r1 * r1;
			
			double dollarA1 = (double)a1 / p1;
			double dollarR1S = r1S / p2;
			
			String result = "Slice of pizza";
			
			if(dollarA1 < dollarR1S) result = "Whole pizza";
			
			System.out.println(result);
		}
	}
}