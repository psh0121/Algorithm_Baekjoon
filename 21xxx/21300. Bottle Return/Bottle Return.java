import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalBottle = 0;
		
		for(int i = 0; i < 6; i++) {
			totalBottle += sc.nextInt();
		}
		
		System.out.println(totalBottle * 5);
	}
}         
