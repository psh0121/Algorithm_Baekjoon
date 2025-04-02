import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] grade = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		Arrays.sort(grade);
		
		System.out.println(grade[1] + grade[2]);
	}
}         