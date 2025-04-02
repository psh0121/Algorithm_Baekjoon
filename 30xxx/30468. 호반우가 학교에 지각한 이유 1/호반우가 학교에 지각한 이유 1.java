import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 4; i++) sum += sc.nextInt();
		
		int n = sc.nextInt() * 4;
		
		if(n - sum < 0) System.out.println(0);
		else System.out.println(n - sum);
	}
}         
