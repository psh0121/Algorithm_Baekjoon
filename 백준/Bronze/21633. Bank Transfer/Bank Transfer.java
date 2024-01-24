import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		double charge = 25 + k / (double)100;
		
		if(charge < 100) charge = 100;
		else if(charge > 2000) charge = 2000;
		
		System.out.println(charge);
	}
}         