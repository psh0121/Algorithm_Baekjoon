import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// testcase

		for(int i = 0; i < t; i++) {
			long x = sc.nextLong();

			System.out.println(x * 2 - 1);
		}
    	sc.close();
    }
}