import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long pactorial = 1;
		for(int i = 1; i <= num; i++) pactorial *= i;
		
		long oneWeek = 7 * 24 * 60 * 60;
		
		System.out.println(pactorial / oneWeek);
	}
}         