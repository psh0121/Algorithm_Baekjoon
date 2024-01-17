import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] bag1 = {sc.nextInt(), sc.nextInt()};
		int[] bag2 = {sc.nextInt(), sc.nextInt()};
		
		int c1 = bag1[0] + bag2[1];
		int c2 = bag1[1] + bag2[0];
		
		System.out.println(Math.min(c1, c2));
	}
}         
