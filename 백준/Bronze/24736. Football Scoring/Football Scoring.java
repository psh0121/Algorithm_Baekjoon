import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] point = {6, 3, 2, 1, 2};
		int team1 = 0;
		int team2 = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			team1 += arr[i] * point[i];
			team2 += arr[i + 5] * point[i];
		}
		
		System.out.println(team1 + " " + team2);
	}
}         
