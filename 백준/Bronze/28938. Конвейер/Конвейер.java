import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			sum += sc.nextInt();
		}
		
		if(sum > 0) System.out.println("Right");
		else if(sum == 0) System.out.println("Stay");
		else System.out.println("Left");
	}
}         
