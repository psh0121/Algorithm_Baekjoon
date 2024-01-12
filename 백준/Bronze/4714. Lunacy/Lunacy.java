import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double n;
		
		while(true) {
			n = sc.nextDouble();
			
			if(n < 0) break;
			
			System.out.println(
					"Objects weighing " + 
					String.format("%.2f", n) + 
					" on Earth will weigh " +
					String.format("%.2f", n * 0.167) +
					" on the moon."
					);
		}
	}
}         
