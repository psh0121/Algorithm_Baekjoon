import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 7 == 0 && i % 11 != 0) System.out.println("Hurra!");
			else if(i % 7 != 0 && i % 11 == 0) System.out.println("Super!");
			else if(i % 7 == 0 && i % 11 == 0) System.out.println("Wiwat!");
			else System.out.println(i);
		}
	}
}