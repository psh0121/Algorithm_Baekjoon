import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int honey = sc.nextInt();
			int garbage = sc.nextInt();

			if(honey == 0 && garbage == 0) break;

			if(honey + garbage == 13) System.out.println("Never speak again.");
			else if(honey > garbage) System.out.println("To the convention.");
			else if(honey == garbage) System.out.println("Undecided.");
			else System.out.println("Left beehind.");
		}
		sc.close(); 
    }
}
