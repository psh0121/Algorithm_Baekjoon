import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// testcase

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();	// cnt
			int location = 0;

			for(int j = 0; j < n; j++) location += sc.nextInt();

			if(location < 0) System.out.println("Left");
			else if(location == 0) System.out.println("Equilibrium");
			else System.out.println("Right");
		}

    	sc.close();
    }
}