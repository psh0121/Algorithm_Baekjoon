import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String result = "S";
		
		for(int i = 0; i < 8; i++) {
			if(sc.nextInt() == 9) result = "F";
		}
		
		System.out.println(result);
	}
}         
