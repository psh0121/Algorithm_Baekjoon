import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divisiorSum = 0;

		for(int i = 1; i <= n; i++) {
			if(n % i == 0) divisiorSum += i;
		}

		System.out.println(divisiorSum * 5 - 24);
    	sc.close();
    }
}