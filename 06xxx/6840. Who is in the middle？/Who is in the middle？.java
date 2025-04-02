import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] bear = new int[3];
		for(int i = 0; i < 3; i++) bear[i] = sc.nextInt();
		
		Arrays.sort(bear);
		System.out.println(bear[1]);
		
	}

}