import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result = "";
		
		if(N == 0) result = "YONSEI";
		else result = "Leading the Way to the Future";
		
		System.out.println(result);
	}
}         