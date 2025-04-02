import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double n;
		
		while(true) {
			n = sc.nextDouble();
			
			if(n == 0) break;
			
			System.out.println(String.format("%.2f", 1 + Math.pow(n, 1) + Math.pow(n, 2) + Math.pow(n, 3) + Math.pow(n, 4)));
		}
	}
}         
