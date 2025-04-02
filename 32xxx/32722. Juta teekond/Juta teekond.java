import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if(
			(n1 == 1 || n1 == 3) &&
			(n2 == 6 || n2 == 8) &&
			(n3 == 2 || n3 == 5)
		) System.out.println("JAH");
		else System.out.println("EI");
		sc.close();
    }
}
