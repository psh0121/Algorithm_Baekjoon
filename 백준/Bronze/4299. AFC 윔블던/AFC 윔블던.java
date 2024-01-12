import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int minus = sc.nextInt();
		
		int teamA = (sum + minus) / 2;
		int teamB = sum - teamA;
		
		if((sum + minus) % 2 != 0 || sum < minus) System.out.println(-1);
		else System.out.println(teamA + " " + teamB);
	}
}         
