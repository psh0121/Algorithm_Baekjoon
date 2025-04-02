import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();	// testcase

		for(int i = 0; i < t; i++) {
			int distance = 0;
			
			// me apt
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int floor1 = sc.nextInt();
			
			// friend apt
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int floor2 = sc.nextInt();

			distance += floor1 + floor2;
			distance += Math.abs(x1 - x2);
			distance += Math.abs(y1 - y2);

			System.out.println(distance);
		}

    	sc.close();
    }
}