import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}

		if(sum == 0 || n == 0) System.out.println("divide by zero");
		else System.out.println("1.00");
    	sc.close();
    }
}