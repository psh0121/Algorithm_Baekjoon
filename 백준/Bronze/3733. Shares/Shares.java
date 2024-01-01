import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int N;
		int S;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			N = sc.nextInt();
			S = sc.nextInt();
			
			System.out.println(S / (N+1));
		}
	}

}