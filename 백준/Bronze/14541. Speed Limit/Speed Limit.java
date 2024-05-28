import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();	// cnt
			if(n == -1) break;

			int totalMiles = 0;
			int beforeHour = 0;
			
			for(int i = 0; i < n; i++) {
				int speed = sc.nextInt();
				int curHour = sc.nextInt();

				totalMiles += speed * Math.abs(beforeHour - curHour);
				beforeHour = curHour;
			}

			System.out.println(totalMiles + " miles");
		}

    	sc.close();
    }
}