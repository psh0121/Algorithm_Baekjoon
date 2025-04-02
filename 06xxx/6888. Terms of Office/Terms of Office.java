import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int startYear = sc.nextInt();
		int endYear = sc.nextInt();
		
		for(int i = startYear; i <= endYear; i += 60) {
			System.out.println("All positions change in year " + i);
		}
	}
}         
