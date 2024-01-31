import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			int people = sc.nextInt();
			int later = sc.nextInt();
			
			System.out.println(people - (later / 7) + (later / 4));
		}
	}
}