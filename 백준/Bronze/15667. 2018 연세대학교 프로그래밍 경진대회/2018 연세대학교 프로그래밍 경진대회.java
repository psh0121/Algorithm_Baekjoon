import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int val1 = 1; val1 <= n - 1; val1++) {
			if((n-1) % val1 == 0) {
				int val2 = (n-1) / val1;

				if(Math.abs(val2 - val1) == 1) {
					System.out.println(Math.min(val1, val2));
					break;
				}
			}
		}
    	sc.close();
    }
}