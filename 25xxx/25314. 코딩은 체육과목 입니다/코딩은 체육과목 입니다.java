import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String result = "int";
		
		for(int i = 0; i < size / 4; i++) {
			result = "long " + result;
		}
		
		System.out.println(result);
	}
}         
