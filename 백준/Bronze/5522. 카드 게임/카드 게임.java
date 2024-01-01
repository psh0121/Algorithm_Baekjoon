import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		while(sc.hasNext()) {
			total += sc.nextInt();
		}
		
		System.out.println(total);
	}

}