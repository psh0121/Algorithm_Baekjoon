import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int[] max = {sc.nextInt() * 3, sc.nextInt() * 20, sc.nextInt() * 120};
		int[] mel = {sc.nextInt() * 3, sc.nextInt() * 20, sc.nextInt() * 120};
		
		int maxSum = 0;
		int melSum = 0;
		
		for(int i = 0; i < max.length; i++) {
			maxSum += max[i];
			melSum += mel[i];
		}
		
		if(maxSum > melSum) System.out.println("Max");
		else if(maxSum == melSum) System.out.println("Draw");
		else System.out.println("Mel");
	}
}         
