import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();

		int distance = Integer.MAX_VALUE;

		int choiceX = 0;
		int choiceY = 0;

		for(int i = 0; i < n; i++) {
			int taxiX = sc.nextInt();
			int taxiY = sc.nextInt();

			int curDistance = Math.abs(x - taxiX) + Math.abs(y - taxiY);

			if(curDistance < distance) {
				distance = curDistance;

				choiceX = taxiX;
				choiceY = taxiY;
			}
		}

		System.out.println(choiceX + " " + choiceY);
		
		sc.close();
    }
}