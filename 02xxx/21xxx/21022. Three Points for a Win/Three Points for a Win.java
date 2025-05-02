import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] ourTeam = sc.nextLine().split(" ");
		String[] otherTeam = sc.nextLine().split(" ");

		int grade = 0;

		for(int i = 0; i < n; i++) {
			int our = Integer.parseInt(ourTeam[i]);
			int other = Integer.parseInt(otherTeam[i]);

			if(our > other) grade += 3;
			else if(our == other) grade += 1;
			else grade += 0;
		}

		System.out.println(grade);
		sc.close(); 
    }
}
