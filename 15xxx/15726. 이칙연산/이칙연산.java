import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double[] arr = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
		
		if((arr[0] * arr[1]) / arr[2] > (arr[0] / arr[1]) * arr[2]) {
			System.out.println((int)((arr[0] * arr[1]) / arr[2]));
		}
		else System.out.println((int)((arr[0] / arr[1]) * arr[2]));
	}
}         
